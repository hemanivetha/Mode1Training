package com.hcl.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("wiring.xml");
		Faculty f=(Faculty)ctx.getBean("faculty");
		f.teaching();
	}

}
