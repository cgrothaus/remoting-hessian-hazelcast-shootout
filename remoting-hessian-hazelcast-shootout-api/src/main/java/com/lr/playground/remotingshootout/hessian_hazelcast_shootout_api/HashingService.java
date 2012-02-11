package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

public interface HashingService
{

	public int hash(DataClass data) throws HashingServiceBusinessException;
	
}
