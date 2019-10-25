package com.hcl.ex;
/**
 *Invalid email. 
 */

public class InvalidEmailException extends Exception {
	  /**
	   * Invalid.
	   */
  public InvalidEmailException(String error){
    super(error);
  }

}
