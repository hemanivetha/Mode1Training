package com.hcl.inventory;

import java.util.Scanner;

public class StockMain {
	
	public static void main(String[] args) {
		int qtyOrd;
		String stockId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stockid and qtyord ");
		stockId=sc.nextLine();
		qtyOrd=Integer.parseInt(sc.nextLine());
		System.out.println(StockBAL.placeOrderBal(stockId, qtyOrd));
	}

}
