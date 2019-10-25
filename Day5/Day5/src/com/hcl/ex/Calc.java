package com.hcl.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *Buffer reader. 
 */

public class Calc {
  /**
   *Read line. 
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      c = a + b;
      System.out.println("Sum is " + c);
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
    }
  }

}
