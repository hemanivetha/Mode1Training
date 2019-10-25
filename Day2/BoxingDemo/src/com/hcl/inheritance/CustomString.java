package com.hcl.inheritance;

public class CustomString {
		static String name;
		String b="Hema";
		public CustomString(String name){
			this.name=name;
		}
		public int length(){
			char[] arr=name.toCharArray();
			int i=0;
			int n=3;
			for(char c:arr){
				i++;
			}
			return i;
		}
		public void position(){
			for(i=0;i<n;i++){
				if(i==n){
					System.out.println("Position of the character"+arr[i]);
				}
			}
		}
		public void cases(){
			String s1upper=name.toUpperCase();
			System.out.println("The Uppercase of the string "+s1upper);
			String s1lower=name.toLowerCase();
			System.out.println("The lower case of the string "+s1lower);
		}
		public void equaling(){
			if
	}
		
		
		
		
		public static void main(String[] args) {
			CustomString obj=new CustomString("Hema");
			System.out.println(obj.length());
		}
}
 