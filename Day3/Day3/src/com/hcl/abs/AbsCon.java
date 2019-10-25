package com.hcl.abs;

abstract class Employ{
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Nive extends Employ{

	public Nive(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}

	
	



	
	
	
}

class Jaya extends Employ{

	public Jaya(int empno, String name, double basic) {
		super(empno, name, basic);
		
	}

	

	
	
}

public class AbsCon {
	public static void main(String[] args) {
		Employ obj1=new Nive(1,"Hema",21);
		Employ obj2=new Jaya(2,"Shiva",23);
		
		Employ[] arrEmploy=new Employ[]{obj1,obj2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}

}
