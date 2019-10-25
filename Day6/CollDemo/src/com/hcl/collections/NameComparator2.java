package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparator2 implements Comparator<Student>{
	List<Student> list=new ArrayList<Employ>();
	
	Collections.sort(list, (p1,p2) -> {
		return p1.name.compareTo(p2.name);
	});
	System.out.println("Order by name wise");
	for(Employ e:list){
		System.out.println(e);
	}
	Collections.sort(list, (p1,p2) -> {
		return (int) (p1.basic-p2.basic);
	});
	System.out.println("Order by basic");
	for(Employ e:list){
		System.out.println(e);
	}
}
