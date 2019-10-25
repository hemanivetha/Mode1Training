package com.hcl.intf;

interface IOne{
	void name();
}
interface ITwo{
	void email();
}
class Test implements IOne,ITwo{

	@Override
	public void email() {
		System.out.println("hemanivetha@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Hema");
	}
	
}

public class MultInh {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}
