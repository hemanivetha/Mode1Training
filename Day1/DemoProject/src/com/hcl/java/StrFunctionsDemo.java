package com.hcl.java;

public class StrFunctionsDemo {
	
	public static void main(String[] args) {
		String str="Welcome to Java Programming";
		System.out.println("Length of the string "+str.length());
		System.out.println("Char at 5th Position "+str.charAt(5));
		System.out.println("Index of'a' is "+str.indexOf('a'));
		System.out.println("Last Occurance of 'a' "+str.lastIndexOf('a'));
		System.out.println("Substring "+str.substring(3,9));
		String s1="hello",s2="hello";
		System.out.println(s1.equals(s2));
		String s3="Java",s4="Programming";
		System.out.println(s3.compareTo(s4));
	}

}
