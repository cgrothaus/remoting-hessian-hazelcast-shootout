package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_client;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.*;
import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.testdata.TestDataPool;

@Component
public class TestClient
{
	
	private HashingService hashingService;

	@Autowired
	public TestClient(HashingService hashingService)
	{
		super();
		System.out.println("TestClient is starting...");
		this.hashingService = hashingService;
	}
	
	@PostConstruct
	public void runTest() throws HashingServiceBusinessException {
		runTest1();
		runTest2();
		runTest3();
		runTest4();
	}

	private void runTest1()
	{
		try
		{
			DataClass d = TestDataPool.testdata.get(0);
			int expectedHashCode = 37 * TestDataPool.testdataWithHashCode.get(d);
			
			DataClass result = hashingService.hash(d);
			Assert.assertEquals(expectedHashCode, result.getCalculatedHashcode());
			System.out.println("runTest1() succeeded!");
		}
		catch (HashingServiceBusinessException e)
		{
			System.err.println("runTest1() failed!");
			e.printStackTrace();
		}
	}
	
	private void runTest2()
	{
		try
		{
			DataClass d = TestDataPool.testdata.get(2);
			int expectedHashCode = 37 * TestDataPool.testdataWithHashCode.get(d);
			
			DataClass result = hashingService.hash(d);
			Assert.assertEquals(expectedHashCode, result.getCalculatedHashcode());
			System.out.println("runTest2() succeeded!");
		}
		catch (HashingServiceBusinessException e)
		{
			System.err.println("runTest2() failed!");
			e.printStackTrace();
		}
	}
	
	private void runTest3()
	{
		try
		{
			DataClass d = TestDataPool.generateRandomFivePack();
			DataClass result = hashingService.hash(d);
			Assert.assertTrue(result.getCalculatedHashcode() != 0);
			System.out.println("runTest3() succeeded!");
		}
		catch (HashingServiceBusinessException e)
		{
			System.err.println("runTest3() failed!");
			e.printStackTrace();
		}
	}
	
	private void runTest4()
	{
		try
		{
			hashingService.hash(DataClass.CAUSES_EXCEPTION);
			System.err.println("runTest4() failed! HashingServiceBusinessException was expected!");
		}
		catch (HashingServiceBusinessException e)
		{
			Assert.assertEquals("I was told to throw up", e.getMessage());
			System.out.println("runTest4() succeeded!");
			// exception was expected
		}
	}

}
