package com.hcl.inventory;

import java.util.Scanner;

import com.hcl.inventory.StockBAL;
import com.hcl.inventory.StockBAL;

public class SearchStockMain {
	
	public static void main(String[] args) {
		String stockId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stock id  ");
		stockId=sc.nextLine();
		Stock objStock=StockBAL.searchStockBal(stockId);
		if(objStock!=null){
			System.out.println("Item Name " +objStock.getItemName());
			System.out.println("Price " +objStock.getPrice());
			System.out.println("Quantity Available " +objStock.getQuantityAvail());
		}
		else{
			System.out.println("Stock id not found");
		}
		
	}

}
