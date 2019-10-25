package com.hcl.ex;
/**
 *Null point exception. 
 */

public class Ex2 {
  /**
   *Exceptions. 
   */
  public static void main(String[] args) {
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (NullPointerException e) {
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("Rethrow Error");
    }
  }

}
