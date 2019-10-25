package com.hcl.java;

public class MaxNum {
	
	public void calc(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("Max num "+a);
		}
		else if(b>c){
			System.out.println("Max num "+b);
		}
		else{
			System.out.println("Max num "+c);
		}
	}
	
	public static void main(String[] args) {
		int a=9,b=8,c=3;
		new MaxNum().calc(a, b, c);
	}

}
