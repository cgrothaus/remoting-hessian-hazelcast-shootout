package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

public class HashingServiceImpl implements HashingService
{

	public int hash(DataClass data) throws HashingServiceBusinessException
	{
		if ("exception".equals(data.getString1())) {
			throw new HashingServiceBusinessException("I was told to throw up");
		}
		
		int hashCode = data.getString1().hashCode();
		hashCode = 37 * hashCode + data.getString2().hashCode();
		hashCode = 37 * hashCode + data.getString3().hashCode();
		hashCode = 37 * hashCode + data.getString4().hashCode();
		hashCode = 37 * hashCode + data.getString5().hashCode();
		return data.getString1().hashCode();
	}

}
