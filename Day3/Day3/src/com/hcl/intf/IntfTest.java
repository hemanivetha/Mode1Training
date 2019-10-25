package com.hcl.intf;

interface IFirst{
	default void name(){
		System.out.println("Name from first");
	}
}
interface ISecond{
	default void name(){
		System.out.println("Name from second");
	}
}
interface IThird{
	default void name(){
		System.out.println("Name from third");
	}
}

class Demo implements IFirst,ISecond,IThird{

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
	}
	
}

public class IntfTest {
	public static void main(String[] args) {
		new Demo().name(); 
	}
	
}
