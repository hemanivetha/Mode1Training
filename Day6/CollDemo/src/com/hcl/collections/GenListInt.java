package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 *Generic List. 
 */

public class GenListInt {
  /**
   *Generic list. 
   */
  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(41));
    lstData.add(new Integer(64));
    lstData.add(new Integer(38));
    lstData.add(new Integer(48));
    lstData.add(new Integer(47));
    int sum = 0;
    for (Integer i: lstData) {
      sum += i;
    }
    System.out.println("Sum is " + sum);
  }

}
