package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockMain {
	
	public static void main(String[] args) {
		String stockId=StockBAL.generateStockIdBal();
		System.out.println(StockBAL.generateStockIdBal());
		String itemname;
		double price;
		int quantityavail;
		Stock objStock=new Stock();
		objStock.setStockId(stockId);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item name ");
		objStock.setItemName(sc.nextLine());
		System.out.println("Enter Price ");
		objStock.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Quantity Available ");
		objStock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		System.out.println(StockBAL.createItemNameBal(objStock));
	}

}
