package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_impl;

import com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api.*;

public class HashingServiceImpl implements HashingService
{

	public DataClass hash(DataClass data) throws HashingServiceBusinessException
	{
		if ("exception".equals(data.getString1())) {
			throw new HashingServiceBusinessException("I was told to throw up");
		}
		
		int hashCode = data.hashCode();
		hashCode = hashCode * 37;
		
		DataClass result = new DataClass(data);
		result.setCalculatedHashcode(hashCode);
		
		return result;
	}

}
