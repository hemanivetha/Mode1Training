package com.hcl.inheritance;


class First{
	static{
		System.out.println("Base class static");
	}
	public First(){
		System.out.println("Base class constructor");
	}
}
class second extends First{
	static{
		System.out.println("Derived class constructor");
	}
	public second(){
		System.out.println("Derived class constructor");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new second();
	}
}
