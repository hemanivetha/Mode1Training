package com.hcl.files;

import java.io.File;
/**
 *Info about the files. 
 */

public class FileInfo {
  /**
   *Information. 
   **/
  public static void main(String[] args) { 
    File f1 = new File("C:/hcljava/Day4/Day4/src/com/hcl/ex/Custom.java");
    System.out.println("File name" + f1.getName());
    System.out.println("Full name" + f1.getAbsolutePath());
    File f2 = new File("C:/hcljava/Day4/Day4/src/com/hcl/ex");
    String [] files = f2.list();
    for (String s : files) { 
      System.out.println(s);
    }
  }

}
