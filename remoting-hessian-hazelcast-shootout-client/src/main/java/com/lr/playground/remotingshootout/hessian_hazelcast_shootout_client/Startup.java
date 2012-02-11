package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup
{
	public static void main(String[] args)
	{
		new ClassPathXmlApplicationContext("applicationContext.xml");
		// this will start up the spring universe
		// as TestClient has a @PostConstruct method, it will run by itself
	}
}
