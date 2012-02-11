package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

import java.io.Serializable;
import java.util.*;

public class DataClass implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private final String string1;
	private final String string2;
	private final String string3;
	private final String string4;
	private final String string5;
	
	private final List<DataClass> listChildren;
	private final Map<String, DataClass> mappedChildren;
	
	public DataClass(String string1, String string2, String string3, String string4, String string5, List<DataClass> listChildren,
			Map<String, DataClass> mappedChildren)
	{
		super();
		this.string1 = string1 != null ? string1 : "";
		this.string2 = string2 != null ? string2 : "";
		this.string3 = string3 != null ? string3 : "";
		this.string4 = string4 != null ? string4 : "";
		this.string5 = string5 != null ? string5 : "";
		
		this.listChildren = new ArrayList<DataClass>(listChildren);
		this.mappedChildren = new HashMap<String, DataClass>(mappedChildren);
	}
	
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String getString1()
	{
		return string1;
	}

	public String getString2()
	{
		return string2;
	}

	public String getString3()
	{
		return string3;
	}

	public String getString4()
	{
		return string4;
	}

	public String getString5()
	{
		return string5;
	}

	public List<DataClass> getListChildren()
	{
		return listChildren;
	}

	public Map<String, DataClass> getMappedChildren()
	{
		return mappedChildren;
	}
	
}
