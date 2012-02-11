package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

public interface HashingService
{

	public DataClass hash(DataClass data) throws HashingServiceBusinessException;
	
}
