package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 *Collections. 
 */

public class GenEmploy {
  /**
   *Collections. 
   */

  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1, "Hema", 636));
    lstEmploy.add(new Employ(2, "Shiva", 637));
    lstEmploy.add(new Employ(3, "Anisha", 638));
    lstEmploy.add(new Employ(4, "Janani", 639));
    lstEmploy.add(new Employ(5, "Priya", 633));
    System.out.println("Employ list");
    lstEmploy.forEach(System.out::println);
  }

}
