package com.hcl.ex;
/**
 *Exception. 
 */

public class Class2 {
  /**
   * Exception.
   */
  class NegativeException extends Exception {  
    /**
     * If the number is negative,exception will be there.
     */
    public NegativeException(String error) {     
      super(error);
    }
  }

}
