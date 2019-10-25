package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *Hashset. 
 */

public class SetDemo {
  /**
   *Hashset.
   **/
  public static void main(String[] args) {
    Set s = new HashSet();
    s.add("Hema");
    s.add("Vinod");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    s.add("Hema");
    s.add("Vinod");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    s.add("Hema");
    s.add("Vinod");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    s.add("Hema");
    s.add("Vinod");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Anubhav");
    System.out.println("Hashset data");
    s.forEach(System.out::println);
  }

}
