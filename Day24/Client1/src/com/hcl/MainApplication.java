package com.hcl;

import java.rmi.RemoteException;

import com.bindu.BinduProxy;
import com.sri.SriProxy;

public class MainApplication {
	

	public static void main(String[] args) {
		
		int res=0;
		int res1=0;
		
		SriProxy s=new SriProxy();
		BinduProxy b=new BinduProxy();
		try {
			res=s.getSapCode();
			res1=b.getInt();
			int result;
			CalculatorProxy calculatorProxy=new CalculatorProxy();
			result=calculatorProxy.add(res, res1);
			System.out.println(res);
			System.out.println(res1);
			System.out.println(result);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
		
		
		


