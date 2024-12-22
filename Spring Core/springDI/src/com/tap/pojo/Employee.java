package com.tap.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	
	int id;
	
	String name;
	
	String email;
	
	int salary;
	@Autowired
	@Qualifier("addrs2")
	Address address;
	@Autowired
	private Collegues collegues;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, int salary, Address address) {
		super();
		System.out.println("Constructor Called");
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
	
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Setter Called");
		this.address = address;
	}
	
	public Collegues getCollegues() {
		return collegues;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + ", collegues=" + collegues + "]";
	}
	
	
	
	
	
}
