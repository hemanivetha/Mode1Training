package com.hcl.ex;

public class Quiz {
	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,5,3};
			a[6]=5/0;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array size small");
		}catch(ArithmeticException e){
			System.out.println("division by zero impossible");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		}

}
