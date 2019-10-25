package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *Printing Integer. 
 */

public class Scan3 {
  /**
   *Integer. 
   */
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("c:/files/data.txt");
      fw.write("12 ram 12.5 22 6 34.6 true " + "false 42 1.5 221 anand prem");
      fw.close();
      FileReader fr = new FileReader("c:/files/data.txt");
      Scanner sc = new Scanner(fr);
      while (sc.hasNext()) { 
        if (sc.hasNextInt()) { 
          System.out.println(sc.nextInt());
        } else {
          sc.next();
        }
      }
      sc.close();
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
