package com.hcl.java;

public class PosNeg {
	
	public void check(int n){
		if(n>=0){
			System.out.println("Positive no...");
		}
		else{
			System.out.println("Negative no...");
		}
	}
	
	public static void main(String[] args) {
		int n=33;
		PosNeg obj=new PosNeg();
		obj.check(n);
	}

}
