package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * Comparator.
 */

public class SortEmploy {
  /**
   *sorting the employ.
   */
  public static void main(String[] args) {
    Comparator c = new BasicComparator();
    SortedSet lstEmploy = new TreeSet(c);
    lstEmploy.add(new Employ(1, "Hema", 74.5));
    lstEmploy.add(new Employ(2, "Nivetha", 767.5));
    lstEmploy.add(new Employ(3, "Rajalakshmi", 723.5));
    lstEmploy.add(new Employ(4, "Jayakumar", 54.5));
    lstEmploy.add(new Employ(5, "Palambal", 789.5));
    System.out.println("Sorted Data");
    lstEmploy.forEach(System.out::println);
  }

}
