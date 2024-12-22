package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFileForAnnotation;
import com.tap.pojo.Employee;

public class LaunchByAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigFileForAnnotation.class);
		Employee e=(Employee)context.getBean(Employee.class);
		System.out.println(e);
	}

}
