package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *Scanning. 
 */

public class ScanFile {
  /**
   *Scanning. 
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("c:/hcljava/Day5/"
          + "Day5/src/com/hcl/collections/ArrEmploy.java");
      Scanner sc = new Scanner(fin);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      sc.close();
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
