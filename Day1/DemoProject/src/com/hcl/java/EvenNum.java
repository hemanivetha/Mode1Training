package com.hcl.java;

public class EvenNum {
	
	public void show(int n){
		int i=0;
		while(i<n){
			i=i+2;
			System.out.println("Even num "+i);
		}
	}
	
	public static void main(String[] args) {
		int n=20;
		new EvenNum().show(n);
		
	}

}
