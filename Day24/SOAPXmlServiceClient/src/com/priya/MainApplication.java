package com.priya;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		
		PriyaProxy c=new PriyaProxy();
		String res=null;
		try {
			res=c.getName();
			System.out.println(res);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
