package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *ArrayList. 
 */

public class ArrListDemo {
  /**
   *ArrayList. 
   */
  public static void main(String[] args) {
    List lstNames = new ArrayList();
    lstNames.add("Hema");
    lstNames.add("HemaSri");
    lstNames.add("HemaPriya");
    lstNames.add("HemaMalini");
    lstNames.add("Hemalatha");
    lstNames.add("HemaShiva");
    System.out.println("Names are ");
    //for (Object object : lstNames) {
    //System.out.println(object);
    //}
    System.out.println("JDK 1.8 ");
    lstNames.forEach(System.out::println);
    /*Edit*/
    lstNames.set(2, "HemaS");
    System.out.println("List after updates");
    lstNames.forEach(System.out::println);
    System.out.println("List after removing by index");
    lstNames.remove(1);
    lstNames.forEach(System.out::println);
    lstNames.remove("HemaMalini");
    System.out.println("List after removing by object");
    lstNames.forEach(System.out::println);
    System.out.println(lstNames.get(3));
  }

}
