package com.hcl.collections;

import java.util.Scanner;
/**
 * Scanning.
 */

public class Scan2 {
  /**
   *Scanning. 
   */
  public static void main(String[] args) {
    System.out.println("Enter 2 nums");
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = a + b;
    System.out.println("Sum is " +  c);
  }

}
