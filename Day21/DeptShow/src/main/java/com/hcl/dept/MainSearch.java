package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.dept.DataQueryDao;

public class MainSearch {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
		d.searchDept(2);
	}
}
