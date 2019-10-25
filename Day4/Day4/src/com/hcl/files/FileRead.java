package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *Reading the files. 
 */

public class FileRead {
  /**
   *Readig the files. 
   */
  public static void main(String[] args) { 
    File f1 = new File("C:/hcljava/Day4/Day4/src/com/hcl/ex/Custom.java");
    try { 
      FileReader fr = new FileReader(f1);
      int ch;
      while ((ch = fr.read()) != -1) { 
        System.out.print((char)ch);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
