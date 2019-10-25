package com.hcl.ex;


class InvalidIdUserNameException extends Exception{ 
	public InvalidIdUserNameException(String error){ 
		super(error);
	}
} 

public class ChkEmail {
public void check(String input) throws InvalidEmailException,InvalidIdUserNameException{
		boolean flag=true;
		if(input.indexOf("@")==-1){
			flag=false;
			throw new InvalidEmailException("Invalid email");
		}
		if(input.indexOf("@")>12){
			flag=false;
			throw new InvalidIdUserNameException("Invalid User Exception");
		}
		if(flag==true){
			System.out.println("Email "+input);
		}
		
	}
	
	public static void main(String[] args) {
		String input="hemanivetha@gmail.com";
		try {
			new ChkEmail().check(input);
		} catch (InvalidEmailException | InvalidIdUserNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
