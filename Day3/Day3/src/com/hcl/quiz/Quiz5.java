package com.hcl.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		Object[] arr=new Object[]
				{
						12,"Hema","Shiva","Welcome",23.4,true
				};
		for (Object object : arr) {
			if(object instanceof Integer){
				System.out.println(object);
			}
			if(object instanceof String){
				System.out.println(object);
			}
		}
	}

}
