package com.hcl;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		int res=0;
		int res1=0;
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		try {
			res=calculatorProxy.mul(2, 4);
			res1=calculatorProxy.add(4, 5);
			System.out.println("Multiplication of 2 numbers :"+res);
			System.out.println("Addition of 2 numbers :"+res1);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
