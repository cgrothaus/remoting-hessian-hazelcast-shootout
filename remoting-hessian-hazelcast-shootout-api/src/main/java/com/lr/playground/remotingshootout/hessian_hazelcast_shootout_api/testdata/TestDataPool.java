package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.testdata;

import java.util.*;

import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.DataClass;

public class TestDataPool
{
	public static final List<DataClass> testdata;
	public static final Map<DataClass, Integer> testdataWithHashCode;
	
	static {
		Map<DataClass, Integer> map = new LinkedHashMap<DataClass, Integer>();

		DataClass d1 = new DataClass(DataClass.EMPTY);
		DataClass d2 = new DataClass("", "", "", "", "", Arrays.asList(new DataClass[]{new DataClass(DataClass.EMPTY)}), Collections.<String, DataClass>emptyMap());
		DataClass d3 = new DataClass("foobar", "", "", "", "");
		
		map.put(d1, -1664653280);
		map.put(d2, -1608308258);
		map.put(d3, 843598637);
		
		testdataWithHashCode = Collections.unmodifiableMap(map);
		testdata = Collections.unmodifiableList(new ArrayList<DataClass>(map.keySet()));
	}
	
	public static DataClass generateRandomSingle() {
		String s1 = UUID.randomUUID().toString();
		String s2 = UUID.randomUUID().toString();
		String s3 = UUID.randomUUID().toString();
		String s4 = UUID.randomUUID().toString();
		String s5 = UUID.randomUUID().toString();
		return new DataClass(s1, s2, s3, s4, s5);
	}
	
	public static DataClass generateRandomFivePack() {
		List<DataClass> l = Arrays.asList(new DataClass[] {generateRandomSingle(), generateRandomSingle()});
		Map<String, DataClass> m = new HashMap<String, DataClass>();
		m.put(UUID.randomUUID().toString(), generateRandomSingle());
		m.put(UUID.randomUUID().toString(), generateRandomSingle());

		String s1 = UUID.randomUUID().toString();
		String s2 = UUID.randomUUID().toString();
		String s3 = UUID.randomUUID().toString();
		String s4 = UUID.randomUUID().toString();
		String s5 = UUID.randomUUID().toString();
		
		return new DataClass(s1, s2, s3, s4, s5, l, m);
	}
}
