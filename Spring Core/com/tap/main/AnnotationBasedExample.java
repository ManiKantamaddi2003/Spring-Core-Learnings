package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.config.ConfigFileAnnotation;
import com.tap.pojo.Employee;

public class AnnotationBasedExample {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigFileAnnotation.class);
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
 
	}

}
