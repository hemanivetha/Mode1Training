package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable{

	@Override
	public void run() {
		List lstData=new ArrayList();
		lstData.add("Hema");
		lstData.add("Nivetha");
		lstData.add("Rajalakshmi");
		lstData.add("Jayakumar");
		lstData.add("Pandurangan");
		lstData.add("Palambal");
		
		for (Object object : lstData) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class LinkDemo implements Runnable{

	@Override
	public void run() {
		LinkedList lst=new LinkedList();
		lst.add("Hema");
		lst.add("Priya");
		lst.add("Bindu");
		lst.add("Jammil");
		lst.addFirst("Janani");
		lst.addLast("Anisha");
		for (Object object : lst) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class VectorDemo implements Runnable{

	@Override
	public void run() {
		Vector v=new Vector();
		v.addElement("Shiva");
		v.addElement("Booma");
		v.addElement("Gayathri");
		v.addElement("Sathish");
		v.addElement("Dhinesh");
		v.addElement("MalarKodi");
		for (Object object : v) {
			System.out.println("Vector " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThrImp {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new ListDemo());
		Thread t2=new Thread(new LinkDemo());
		Thread t3=new Thread(new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
