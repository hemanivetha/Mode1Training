package com.hcl.products;

import java.util.List;

public class OrderLogic {
	
	private List items;

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	
	public void display(){
		for(int i=0;i<items.size();i++){
			Order o=(Order)items.get(i);
			o.display();
			int value=o.getQtyOrd()-o.getObjproduct().getQuantityAvail();
			if(!(value>=0)){
				System.out.println("Total Amount= "+(o.getObjproduct().getPrice()*o.getQtyOrd()));
			}else{
				System.out.println("Insufficient Product");
			}
		}
	}

	
}
