package com.hcl.inventory;

public class Stock {
	
	private String stockId;
	private String itemName;
	private double price;
	private int quantityAvail;
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	
	

}
