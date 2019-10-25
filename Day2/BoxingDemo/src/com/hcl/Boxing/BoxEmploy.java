package com.hcl.Boxing;

public class BoxEmploy {
	
	public void show(Object ob){
		Employ e=(Employ)ob;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		objEmploy.empno=1;
		objEmploy.name="Hema";
		objEmploy.basic=1078;
		
		new BoxEmploy().show(objEmploy);
	}

}
