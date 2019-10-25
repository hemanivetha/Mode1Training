package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.hcl.inventory.DaoConnection;

public class StockTestCase {
	
	@Test 
	public void testPlaceOrder(){
		assertEquals("Order placed Successfully", StockBAL.placeOrderBal("s002", 1));
		assertEquals("insufficient Quantity", StockBAL.placeOrderBal("s001", 17));
		assertEquals("stock id not found", StockBAL.placeOrderBal("g897", 7));
	}
	@Test
	public void testGenerateOrderId(){
		Connection con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1 "
				+ "else max(orderid)+1 end orderid from orders";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			orderid=rs.getInt("orderid");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(orderid, StockBAL.generateOrderBal());
	}
	
	@Test
	public void testSearchStock(){
		assertNotNull(StockBAL.searchStockBal("s002"));
		assertNull(StockBAL.searchStockBal("s000"));
	}
	
	@Test
	public void testCreateStockId(){
		Stock objStock=new Stock();
		String stockId=StockBAL.generateStockIdBal();
		objStock.setStockId(stockId);
		objStock.setItemName("Charger");
		objStock.setPrice(2000);
		objStock.setQuantityAvail(7);
		assertEquals("Stock Created Successfully", StockBAL.createItemNameBal(objStock));
	}
	
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testGenerateStockId(){
		Connection con = DaoConnection.getConnection();
		String stockId;
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
		assertEquals(stid, StockBAL.generateStockIdBal());
	}

	@Test
	public void testGettersandSetters() {
		Stock objStock=new Stock();
		objStock.setStockId("s001");
		objStock.setItemName("Laptop");
		objStock.setPrice(20000);
		objStock.setQuantityAvail(7);
		
		assertEquals("s001",objStock.getStockId());
		assertEquals("Laptop", objStock.getItemName());
		assertEquals(20000, objStock.getPrice(),0.00);
		assertEquals(7, objStock.getQuantityAvail());
		
	}

}
