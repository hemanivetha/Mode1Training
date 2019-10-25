package com.hcl.project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb=new StringBuilder();
	public boolean addStudentBal(Student objStudent) throws StudentException{
		boolean isAdded=true;
		
		if(objStudent.getSno() <= 0){
			sb.append("Student no cannot be negative or zero \r\n");
			isAdded=false;
		}
		if(objStudent.getName().length() <= 3){
			sb.append("Name more than 3 characters \r\n");
			isAdded=false;
		}
		if(objStudent.getCgp() <0){
			sb.append("cgp non negative \r\n");
			isAdded=false;
		}
		if(isAdded==false){
			throw new StudentException(sb.toString());
		}else{
			new StudentDAO().addStudentDao(objStudent);
		}
		return isAdded;
	}
	public Student searchStudentBal(int sno){
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}
	
	public String updateStudentBal(Student objStudent){
		return new StudentDAO().updateStudentDao(objStudent);
	}
	
	public String deleteStudentBal(int sno){
		return new StudentDAO().deleteStudentDao(sno);
	}

}
