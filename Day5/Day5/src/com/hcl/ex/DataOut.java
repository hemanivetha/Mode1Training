package com.hcl.ex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
	
	public static void main(String[] args) {
		try {
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("c:/files/data.txt"));
			dout.writeInt(12);
			dout.writeUTF("HCL");
			dout.writeDouble(635.5);
			dout.writeBoolean(true);
			dout.close();
			System.out.println("*** File Created ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	

}
