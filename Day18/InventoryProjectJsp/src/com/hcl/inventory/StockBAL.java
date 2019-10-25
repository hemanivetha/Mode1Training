package com.hcl.inventory;

public class StockBAL {
	
	public static int generateOrderBal(){
		return new StockDAO().generateOrderIdDao();
	}
	
	public static String placeOrderBal(String stockId,int qtyOrd){
		return new StockDAO().placeOrder(stockId, qtyOrd);
	}
	
	public static Stock searchStockBal(String stockId){
		return new StockDAO().searchStockDao(stockId);
	}
	
	
	
	
	public static String createItemNameBal(Stock stock){
		return new StockDAO().createItemNameDao(stock);
	}
	public static String generateStockIdBal(){
		return new StockDAO().generateStockIdDao();
	}
	
	

}
