package com.fault;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="HelloWorld" ,serviceName="HelloWorldService")
public class HelloWorld {
	
	@WebMethod
	public String sayHello(String msg) throws MissingName{
		if(msg==null || msg.isEmpty()){
			throw new MissingName();
		}
		return "Here is the Message "+ msg +".";
	}

}
