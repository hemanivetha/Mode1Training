package com.hcl.inventory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hcl.inventory.Stock;
import com.hcl.inventory.DaoConnection;


public class StockDAO {
	
	PreparedStatement pst;
	Connection con;
	
	public int generateOrderIdDao(){
		con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1 "
				+ "else max(orderid)+1 end orderid from orders";
		try {
			pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			orderid=rs.getInt("orderid");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderid;
	}
	
	public String placeOrder(String stockId,int qtyOrd){
		con=DaoConnection.getConnection();
		Stock stock=searchStockDao(stockId);
		String result="";
		if(stock!=null){
			int qtyAvail=stock.getQuantityAvail();
			if(qtyAvail-qtyOrd >=0){
				String cmd="update stock set quantityavail=quantityavail-? where stockid=?";
				try {
					pst=con.prepareStatement(cmd);
					pst.setInt(1, qtyOrd);
					pst.setString(2, stockId);
					pst.executeUpdate();
					int ordid=generateOrderIdDao();
					cmd="insert into orders(orderid,stockid,qtyord,billamt) values(?,?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, ordid);
					pst.setString(2, stockId);
					pst.setInt(3, qtyOrd);
					double total=qtyOrd*stock.getPrice();
					pst.setDouble(4, total);
					pst.executeUpdate();
					cmd="update amount set gamt=gamt+?";
					pst=con.prepareStatement(cmd);
					pst.setDouble(1, total);
					pst.executeUpdate();
					result="Order placed Successfully";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result=e.getMessage();
				}
			}else{
				result="insufficient Quantity";
			}
		}else{
			result="stock id not found";
		}
		return result;
	}
	
	public  Stock searchStockDao(String stockId){
		con=DaoConnection.getConnection();
		String cmd="select * from Stock where stockid=?";
		Stock objStock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stockId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objStock=new Stock();
				objStock.setItemName(rs.getString("itemName"));
				objStock.setPrice(rs.getDouble("price"));
				objStock.setQuantityAvail(rs.getInt("quantityAvail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objStock;
	}
	
	public String createItemNameDao(Stock objStock){
		con=DaoConnection.getConnection();
		String cmd="insert into stock(stockid,itemName,price,quantityAvail)"
				+ "values(?,?,?,?)";
		String result="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, objStock.getStockId());
			pst.setString(2, objStock.getItemName());
			pst.setDouble(3, objStock.getPrice());
			pst.setInt(4, objStock.getQuantityAvail());
			pst.executeUpdate();
			result="Stock Created Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
	
	
	public String generateStockIdDao(){
		con=DaoConnection.getConnection();
		
		String cmd="select max(stockid) sid from stock";
		String stid="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("sid");
			int id=Integer.parseInt(stid.substring(1));
			id++;
			String formatted=String.format("%03d", id);
			
			stid="s"+formatted;
			//if(id >=1 && id <=9){
				//stid="s00"+id;
			//}
			//if(id >=10 && id <=99){
				//stid="s0"+id;
			//}
			//if(id >=100 && id <=999){
				//stid="s"+id;
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stid;
	}

}
