package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 *Sorted set. 
 */

public class SortEmp {
  /**
   *Sorted employ. 
   */
  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add(new Emp(1, "Hema", 848.4));
    s.add(new Emp(2, "Nivetha", 32.4));
    s.add(new Emp(3, "Rajalakshmi", 868.4));
    s.add(new Emp(4, "Jayakumar", 458.4));
    s.add(new Emp(5, "Palambal", 448.4));
    System.out.println("sorted data");
    s.forEach(System.out::println);
  }

}
