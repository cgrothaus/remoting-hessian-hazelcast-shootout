package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

public class HashingServiceBusinessException extends Exception
{

	private static final long serialVersionUID = 1L;

	public HashingServiceBusinessException()
	{
	}

	public HashingServiceBusinessException(String message)
	{
		super(message);
	}

	public HashingServiceBusinessException(Throwable cause)
	{
		super(cause);
	}

	public HashingServiceBusinessException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
