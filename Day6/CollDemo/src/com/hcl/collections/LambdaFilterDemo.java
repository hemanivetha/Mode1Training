package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, "Hema", 23000));
		list.add(new Product(2, "Priya", 65000));
		list.add(new Product(3, "Anisha", 24000));
		list.add(new Product(4, "Shiva", 47000));
		list.add(new Product(5, "Bindu", 76000));
		list.add(new Product(6, "Jahanat", 12000));
		
		list.stream().filter(p ->p.price >= 25000). forEach(x ->{
			System.out.println(x);
		});
		System.out.println("Names start with s ");
		list.stream().filter(p ->p.name.startsWith("s")).forEach(x ->{
			System.out.println(x);
		});
			
		Product maxP=list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("Max price record");
		System.out.println(maxP);
		
		Product minP=list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("Min price record");
		System.out.println(minP);
	}

}
