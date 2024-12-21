package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class XmlBasedExample {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/tap/config/applicationcontext.xml");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp1);

	}

}
