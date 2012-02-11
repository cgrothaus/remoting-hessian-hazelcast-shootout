package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_impl;

import org.junit.*;

import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.DataClass;
import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.HashingServiceBusinessException;
import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.testdata.TestDataPool;

public class HashingServiceImplTest
{
	private HashingServiceImpl classUnderTest;
	
	@Before
	public void setUp() {
		classUnderTest = new HashingServiceImpl();
	}
	
	@Test
	public void testWithPredefinedInstance1() throws HashingServiceBusinessException {
		DataClass d = TestDataPool.testdata.get(0);
		int expectedHashCode = 37 * TestDataPool.testdataWithHashCode.get(d);
		
		DataClass result = classUnderTest.hash(d);
		Assert.assertEquals(expectedHashCode, result.getCalculatedHashcode());
	}
	
	@Test
	public void testWithPredefinedInstance2() throws HashingServiceBusinessException {
		DataClass d = TestDataPool.testdata.get(1);
		int expectedHashCode = 37 * TestDataPool.testdataWithHashCode.get(d);
		
		DataClass result = classUnderTest.hash(d);
		Assert.assertEquals(expectedHashCode, result.getCalculatedHashcode());
	}
	
	@Test
	public void testWithPredefinedInstance3() throws HashingServiceBusinessException {
		DataClass d = TestDataPool.testdata.get(2);
		int expectedHashCode = 37 * TestDataPool.testdataWithHashCode.get(d);
		
		DataClass result = classUnderTest.hash(d);
		Assert.assertEquals(expectedHashCode, result.getCalculatedHashcode());
	}

	@Test(expected=HashingServiceBusinessException.class)
	public void testWithException() throws HashingServiceBusinessException {
		classUnderTest.hash(DataClass.CAUSES_EXCEPTION);
	}

}

