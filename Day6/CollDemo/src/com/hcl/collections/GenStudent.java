package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 *Student. 
 */

public class GenStudent {
  /**
   *Student. 
   */
  public static void main(String[] args) {
    List<Student> lstStudent = new ArrayList<Student>();
    lstStudent.add(new Student("Hema", "Jayakumar", "Chennai", 23.6));
    lstStudent.add(new Student("Nivetha", "Jayakumar", "Bangalore", 54.6));
    lstStudent.add(new Student("Rajalakshmi", "Jayakumar", "Pondicherry", 232.6));
    lstStudent.add(new Student("Shiva", "Jayakumar", "Embalam", 256.6));
    lstStudent.add(new Student("HemaSri", "Jayakumar", "TamilNadu", 6.6));
    System.out.println("Student list");
    lstStudent.forEach(System.out::println);
  }


}
