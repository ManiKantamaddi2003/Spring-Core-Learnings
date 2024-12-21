package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {
	
	@Bean("emp")
	public Employee createObject()
	{
		Employee e=new Employee();
		e.setId(1);
		e.setName("Manikanta");
		e.setAge(22);
		e.setSalary(700022);;
		return e;
	}
	@Bean("emp1")
	public Employee createObject1()
	{
		Employee e=new Employee();
		e.setId(2);
		e.setName("Doshna");
		e.setAge(22);
		e.setSalary(7005000);
		return e;
	}

}
