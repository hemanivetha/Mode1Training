package com.hcl.Boxing;

public class P2 {
	
	public void show(Object ob){
		if(ob=="ABC"){
			System.out.println("Correct A and D");
		}
		else{
			System.out.println("Error B and C");
		}
	}
	public static void main(String[] args) {
		String s="ABC";
		P2 obj=new P2();
		obj.show(s);
	}
}
