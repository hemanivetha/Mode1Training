package com.hcl.collections;

/**
 *Employ.
 */
public class Employ {
  int empno;
  String name;
  double basic;
  
  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  /**
   *Employ. 
   */
  
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

}
