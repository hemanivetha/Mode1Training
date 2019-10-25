package com.hcl.model;

public class Employee {
	
	private long empno;
	private String empName;
	private long salary;
	private String dateOfjoin;
	private String band;
	public long getEmpno() {
		return empno;
	}
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDateOfjoin() {
		return dateOfjoin;
	}
	public void setDateOfjoin(String dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", salary=" + salary + ", dateOfjoin=" + dateOfjoin
				+ ", band=" + band + "]";
	}
	public Employee(long empno, String empName, long salary, String dateOfjoin, String band) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.salary = salary;
		this.dateOfjoin = dateOfjoin;
		this.band = band;
	}
	
	

}
