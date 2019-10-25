package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;

public class JsonMultiDimen {
	public static void main(String[] args) {
		
	JSONArray obj = new JSONArray();
	 for(int i=0;i<2;i++){
		  JSONArray arr = new JSONArray();  
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Name: ");
		  String name=sc.next();
		  System.out.print("Age: ");
		  int age=sc.nextInt();
		  System.out.print("Salary: ");
		  double sal=sc.nextDouble();
		  
		  arr.add(name);    
		  arr.add(age);    
		  arr.add(sal); 
		  obj.add(i, arr);
	 }
	 System.out.print(obj); 
}

}
