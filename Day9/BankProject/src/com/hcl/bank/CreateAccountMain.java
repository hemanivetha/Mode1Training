package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	
	public static void main(String[] args) {
		int accountno=AccountBAL.generateAccountBal();
		//System.out.println(accountno);
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(accountno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name ");
		objAccounts.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name ");
		objAccounts.setLastName(sc.nextLine());
		System.out.println("Enter City ");
		objAccounts.setCity(sc.nextLine());
		System.out.println("Enter State ");
		objAccounts.setState(sc.nextLine());
		System.out.println("Enter Amount ");
		objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter CheqFacil ");
		objAccounts.setCheqFacil(sc.nextLine());
		System.out.println("Enter Account type ");
		objAccounts.setAccountType(sc.nextLine());
		System.out.println(AccountBAL.createAccountBal(objAccounts));
		
		
	}

}
