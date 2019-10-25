package com.hcl.inheritance;

class B1{
	public int a=9;
	private int b=2;
	protected int c=4;
	int d=8;
	public void show1(){
		System.out.println("Public "+a);
		System.out.println("Private "+b);
		System.out.println("Protected "+c);
		System.out.println("Default "+d);
		
	}
}
class B2{
	public void show2(){
		B1 i=new B1();
		System.out.println("Public "+i.a);
		System.out.println("Private "+i.b);
		System.out.println("Protected "+i.c);
		System.out.println("Default "+i.d);
	}
}
class B3 extends B1{
	public void show3(){
		System.out.println("Public "+a);
		System.out.println("Private "+b);
		System.out.println("Protected "+c);
		System.out.println("Default "+d);
		
	}
}
public class AccessSpecifiers {
	
	public static void main(String[] args) {
		B1 obj1=new B1();
		obj1.show1();
		B2 obj2=new B2();
		obj2.show2();
		B3 obj3=new B3();
		obj3.show3();
	}

}
