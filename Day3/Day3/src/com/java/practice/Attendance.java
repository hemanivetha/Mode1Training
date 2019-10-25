package com.java.practice;

public class Attendance {
	public static void display(Object...ob){
		for (Object object : ob) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
	
	public static void show(int day,String...name){
		for (String s : name) {
			System.out.print(day+"" +s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(2,"Hema","Nivetha");
		show(3,"Shiva","Subra","Manian");
		
		display();
		display("Hema",256,"Shiva",true,12.5);
	}

}
