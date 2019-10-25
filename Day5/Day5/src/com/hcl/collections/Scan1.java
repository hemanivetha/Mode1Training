package com.hcl.collections;

import java.util.Scanner;
/**
 *Scanner. 
 */

public class Scan1 {
  /**
   *Scanner. 
   */
  public static void main(String[] args) {
    System.out.println("Enter your name");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Name is " + name);
  }

}
