package com.hcl.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *Buffer reader. 
 */

public class Custom {
  /**
   *Read the line. 
   */
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name ");
    try {
      String name = br.readLine();
      System.out.println("Name " + name);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }

}
