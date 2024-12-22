package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Launch {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/tap/config/ApplicationContext.xml");
		Employee em=(Employee)context.getBean("emp");
		System.out.println(em);
	}

}
