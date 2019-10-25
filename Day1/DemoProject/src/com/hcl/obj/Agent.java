package com.hcl.obj;

public class Agent {
	
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipCode){
		StringBuilder obj=new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!='A'){
			obj.append("AgentId is wrong");
			isValid=false;
		}
		if(fullName.length()>=20 ){
			obj.append("Fullname cannot cross 20 characters ");
			isValid=false;
		}
		if(fullName.indexOf(' ')==-1){
			obj.append("Fullname must contain space");
			isValid=false;
		}
		if(maritalStatus!=0 && maritalStatus!=1){
			obj.append("Marital status should be 0 or 1 ");
			isValid=false;
		}
		if(zipCode.length()!=6){
			obj.append("Zipcode should be six characters");
			isValid=false;
		}
		if(isValid==true){
			System.out.println("AgentId "+agentId +"\r\n");
			System.out.println("Fullname "+fullName +"\r\n");
			System.out.println("Marital Status "+maritalStatus +"\r\n");
			System.out.println("Zipcode "+zipCode +"\r\n");
		}
		return obj;
	}
	public static void main(String[] args) {
		String agentId="Agri";
		String fullName="Hema Jayakumar";
		int maritalStatus=0;
		String zipCode="bopbip";
		StringBuilder sbRes=new Agent().show(agentId,fullName,maritalStatus,zipCode);
		System.out.println(sbRes);
		
	}

}
