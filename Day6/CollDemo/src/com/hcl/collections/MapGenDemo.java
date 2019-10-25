package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(1, "Hema");
		m.put(2, "Priya");
		m.put(3, "Anisha");
		m.put(4, "Janani");
		m.put(5, "Bindhu");
		
		int key;
		String result;
		System.out.println("Enter the key ");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		result=m.getOrDefault(key, "Not Found  ");
		System.out.println(result);
	}

}
