package com.tap.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Employee;

public class JavaBasedExample {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class)) {
			Employee e=(Employee)context.getBean("emp");
			System.out.println(e);
			Employee e2=(Employee)context.getBean("emp1");
			System.out.println(e2);
		} catch (BeansException e) {
			
			e.printStackTrace();
		}

	}

}
