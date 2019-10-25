
package com.hcl.enumeration;

enum Student{
	Anisha,Hema,Janani,Priya
}
public class Enum3 {
	
	public static void show(){
		Student[] arrStudent=Student.values();
		for (Student student : arrStudent) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		show();
	}

}
