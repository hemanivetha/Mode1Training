package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 *Lambda. 
 */

public class Lambda1 {
  /**
   *Lambda. 
   */
  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(52));
    lstData.add(new Integer(587));
    lstData.add(new Integer(54));
    lstData.add(new Integer(12));
    lstData.add(new Integer(23));
    lstData.forEach(p -> {
      if (p > 40) { 
        System.out.println(p);
      }
    });
  }

}
