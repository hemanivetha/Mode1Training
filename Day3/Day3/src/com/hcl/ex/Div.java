package com.hcl.ex;

public class Div {
	
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division "+c);
		}catch(ArithmeticException e){
			System.out.println("Division by zero is impossible");
		}catch(NumberFormatException e){
			System.out.println("Sting cannot be converted as int");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds");
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("Program by HCL participants");
		}
	}

}
