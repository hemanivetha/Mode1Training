package com.hcl.ex;
/**
 *assert. 
 */

public class AssertDemo {
  /**
   * Asserting.
   */
  public void incr() { 
    int basic = 12000;
    for (int i = 0;i < 10;i++) { 
      basic = basic + 4000;
      assert basic < 48000;
      System.out.println("Salary " + basic);
    }
  }
  
  public static void main(String[] args) {
    new AssertDemo().incr();
  }

}
