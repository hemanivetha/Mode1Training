package com.hcl.java;

public class Sbexample {
	
	public void show(int age,String name,String course,String city){
		StringBuilder obj=new StringBuilder();
		boolean isValid=true;
		/* validation for age */
		if(age<=20){
			obj.append("Age must be greater than 20"+"\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')==-1){
			obj.append("Name contains both Firstname and Lastname"+"\r\n");
					isValid=false;
		}
		if(!course.equalsIgnoreCase("Java")){
			obj.append("Only Java Course allowed.."+"\r\n");
			isValid=false;
		}
		if(isValid==true)
		{
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
		System.out.println("Course :"+course);
		System.out.println("City :"+city);
		}
		else{
			System.out.println(obj);
		}
	}
	
	
	public static void main(String[] args) {
		int age=22;
		String name="Hema Jayakumar";
		String course="Java";
		String city="Bangalore";
		new Sbexample().show(age, name, course, city);
	}

}
   