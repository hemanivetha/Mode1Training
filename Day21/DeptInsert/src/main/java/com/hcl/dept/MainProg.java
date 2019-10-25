package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.dept.DataInsert;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataInsert d=(DataInsert)ctx.getBean("myDao");
		d.insertDept();
		System.out.println("Record Inserted");
	}

}
