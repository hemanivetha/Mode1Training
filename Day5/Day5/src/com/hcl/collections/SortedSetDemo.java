package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 *Sorted set.
 */

public class SortedSetDemo {
  /**
   * Sorted set.
   */
  public static void main(String[] args) {
    SortedSet s  = new TreeSet();
    s.add("Hema");
    s.add("Vinod");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    System.out.println("Sorted data");
    s.forEach(System.out::println);
  }

}
