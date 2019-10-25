package com.hcl.quiz;

class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
}
class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
	}

}
class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
	}
	
}
public class Quiz4 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]
				{
						new HrEmploy("Hema"),
						new JavaEmploy("Hemanivetha"),
						new HrEmploy("Shiva"),
						new JavaEmploy("Shivasubramanian"),
						new HrEmploy("Mani"),
						new JavaEmploy("Karthik"),
						new HrEmploy("Niranjana")
				};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}
}
