package com.hcl.Boxing;

public class StudentTest {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=21;
		s1.name="Hema";
		s1.city="Bangalore";
		s1.cgp=8.9;
		
		Student s2=new Student();
		s2.sno=21;
		s2.name="Hema";
		s2.city="Pondicherry  ";
		s2.cgp=8.9;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
