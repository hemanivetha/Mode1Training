package com.hcl.Boxing;

public class ConDemo {
	
	static{
		System.out.println("Static Constructor ..");
	}

	
	
	public ConDemo() {
		System.out.println("Default Constructor ..");

	}



	public static void main(String[] args) {
		new ConDemo();
	}
}
