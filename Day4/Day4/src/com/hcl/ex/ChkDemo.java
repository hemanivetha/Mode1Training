package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *File. 
 */

public class ChkDemo {
  /**
   *File. 
   */
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream f1 = new FileInputStream("c:/hello.txt");
  }

}
