package com.hcl.Boxing;

public class P1 {
	
	public void show(int x){
		switch(x){
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Bye");
			break;
		case 3:
			System.out.println("Hello");
		case 4:
			System.out.println("Test");
		case 5:
			System.out.println("Demo");
			default:
				System.out.println("Default message");
		}
	}
	public static void main(String[] args) {
		P1 obj=new P1();
		obj.show(3);
	}

}
