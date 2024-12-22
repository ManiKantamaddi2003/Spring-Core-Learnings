package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Address;
import com.tap.pojo.Collegues;
import com.tap.pojo.Employee;
@Configuration
public class ConfigFile {
	@Bean("addrs")
	public Address adrs()
	{
		Address ad=new Address();
		ad.setLaneName("6-22");
		ad.setCity("Banglore");
		ad.setState("Kar");
		ad.setCountry("India");
		return ad;
	}
	@Bean("addrs2")
	public Address adrs2()
	{
		Address ad2=new Address();
		ad2.setLaneName("6-22");
		ad2.setCity("Bankkok");
		ad2.setState("Ass");
		ad2.setCountry("India");
		return ad2;
	}
	
	@Bean("collegues")
	public Collegues cgs()
	{
		Collegues obj=new Collegues();
		obj.setName("Aa");
		obj.setName2("Bb");
		obj.setName3("Cc");
		obj.setName4("Dd");
		return obj;
	}
	
	@Bean("employee")
	public Employee emp()
	{
		Employee e=new Employee();
		e.setId(1);
		e.setName("DNVB");
		e.setEmail("dnvb@gmail.com");
		e.setSalary(123456);
		
		return e;
		
	}

}
