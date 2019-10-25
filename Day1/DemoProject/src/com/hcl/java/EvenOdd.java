package com.hcl.java;

public class EvenOdd {
	
	
	public void check(int n){
		if(n%2==0){
			System.out.println("Even no...");
		}
		else{
			System.out.println("Odd no...");
		}
	}
	public static void main(String[] args) {
		int n=33;
		new EvenOdd().check(n);
		
	}

}
