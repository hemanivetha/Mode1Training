package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ListReduceDemo {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(12);
		lst.add(12);
		lst.add(12);
		lst.add(12);
		
		int sum=lst.stream().reduce(1, (e1,e2) -> e1+e2);
		System.out.println(sum);
	}

}
