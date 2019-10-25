package com.fault;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		HelloWorldProxy hw=new HelloWorldProxy();
		String res=null;
		try {
			res=hw.sayHello("Hema");
			System.out.println(res);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
