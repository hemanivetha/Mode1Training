package com.hcl.Boxing;

public class EmployTest {
	
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=1;
		e1.name="Hema";
		e1.basic=234;
		
		Employ e2=new Employ();
		e2.empno=1;
		e2.name="Hema";
		e2.basic=234;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
	}

}
