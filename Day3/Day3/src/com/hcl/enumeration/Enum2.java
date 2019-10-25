package com.hcl.enumeration;


enum DayName{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class Enum2 {
	DayName day;
	public Enum2(DayName day){
		this.day=day;
	}
	
	public static void main(String[] args) {
		String day="WEDNESDAY";
		Enum2 obj=new Enum2(DayName.valueOf(day));
		System.out.println(day);
	}

}
