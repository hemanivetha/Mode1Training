package com.java.practice;
class First{
	public void show(){
		System.out.println("Show method ");
	}
}
class Second extends First{
	public void show(){
		
		System.out.println("Second");
	}
}
public class InhDemo {
	
	public static void main(String[] args) {
		//Second obj=new Second();
		//obj.show();
		First obj1=new Second();
		Second obj2=new Second();
		//First f1=(First)obj2;
		//f1.show();
		//First f2=(Second)obj1;
		//f2.show();
		Second f3=(Second)obj1;
		f3.show();
	}

}
