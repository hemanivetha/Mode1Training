package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("Hema", "Nivetha");
		m.put("Hemapriya", "Jayakumar");
		m.put("Hemajan", "Rajalakshmi");
		m.put("Hemani", "Shiva");
		m.put("Hemabindh", "Palambal");
		
		String key="Hemabindh";
		String value=(String)m.getOrDefault(key, "Not found");
		System.out.println(value);
		
	}

}
