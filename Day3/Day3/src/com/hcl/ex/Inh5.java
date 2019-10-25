package com.hcl.ex;

class Ab{
	int a,b;
	public Ab(){
		a=5;
		b=6;
	}
	@Override
	public String toString() {
		return "C1 [a=" + a + ", b=" + b + "]";
	}
	
}
class Ba extends Ab{
	public Ba(int a,int b){
		
	}
}

public class Inh5 {
	public static void main(String[] args) {
		Ba obj=new Ba(12,5);
		System.out.println(obj);
	}

}
