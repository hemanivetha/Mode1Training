package com.hcl.Boxing;

public class BoxStudent {
	
	public void show(Object ob){
		Student s=(Student)ob;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Student objStudent=new Student();
		objStudent.sno=123;
		objStudent.name="Hema";
		objStudent.city="Bangalore";
		objStudent.cgp=9.6;
		
		new BoxStudent().show(objStudent);
	}

}
