package com.hcl.ex;
/**
 * Final Statement.
 */

public class Ex1 {
  /**
  * Return.
  */
  public static void main(String[] args) {  
    try { 
      return;
    } catch (Exception e) { 
      System.out.println("Hi");
    } finally { 
      System.out.println("Finally");
    }
  }

}
