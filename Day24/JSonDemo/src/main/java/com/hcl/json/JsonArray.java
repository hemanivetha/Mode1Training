package com.hcl.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArray {

	public static void main(String args[]){  
		  JSONObject obj=new JSONObject();
		  for(int i=0;i<3;i++){
		  JSONArray arr = new JSONArray();  
		  
		  arr.add("Hema"+i);    
		  arr.add(21+i);    
		  arr.add(6000*i); 
		  obj.put(i, arr);
		  
		  /*
		  arr.add("Shiva");    
		  arr.add(new Integer(23));    
		  arr.add(new Double(800000));   

		  arr.add("Nivetha");    
		  arr.add(new Integer(20));    
		  arr.add(new Double(300000));  */
		  
		  }
		  System.out.print(obj); 
		}}    
