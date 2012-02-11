package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

import org.junit.Assert;
import org.junit.Test;

import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.testdata.TestDataPool;

public class DataClassTest
{

	@Test
	public void testPredefinedInstance1() {
		DataClass d = TestDataPool.testdata.get(0);
		int expectedHashCode = TestDataPool.testdataWithHashCode.get(d);
		
		System.out.println(d);
		Assert.assertEquals(expectedHashCode, d.hashCode());
	}
	
	@Test
	public void testPredefinedInstance2() {
		DataClass d = TestDataPool.testdata.get(1);
		int expectedHashCode = TestDataPool.testdataWithHashCode.get(d);
		
		System.out.println(d);
		Assert.assertEquals(expectedHashCode, d.hashCode());
	}
	
	@Test
	public void testPredefinedInstance3() {
		DataClass d = TestDataPool.testdata.get(2);
		int expectedHashCode = TestDataPool.testdataWithHashCode.get(d);
		
		System.out.println(d);
		Assert.assertEquals(expectedHashCode, d.hashCode());
	}
	
	@Test
	public void testGenerateRandomSingle() {
		DataClass d = TestDataPool.generateRandomSingle();
		
		System.out.println(d);
		Assert.assertTrue(d.hashCode() != 0);
	}
	
	@Test
	public void testGenerateRandomFivePack() {
		DataClass d = TestDataPool.generateRandomFivePack();
		
		System.out.println(d);
		Assert.assertTrue(d.hashCode() != 0);
	}
	
}
