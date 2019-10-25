package com.hcl.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student> c=new NameComparator2<Student>();
		Set<Student> setStudent=new TreeSet<Student>(c);
		setStudent.add(new Student("Hema", "Jayakumar", "Chennai", 23.6));
		setStudent.add(new Student("Nivetha", "Jayakumar", "Bangalore", 54.6));
		setStudent.add(new Student("Rajalakshmi", "Jayakumar", "Pondicherry", 232.6));
		setStudent.add(new Student("Shiva", "Jayakumar", "Embalam", 256.6));
		setStudent.add(new Student("HemaSri", "Jayakumar", "TamilNadu", 6.6));
		System.out.println("Student list");
		setStudent.forEach(System.out::println);
	}

}
