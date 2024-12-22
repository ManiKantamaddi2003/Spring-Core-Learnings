package com.tap.pojo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	
	private String laneName;
	
	private String city;
	
	private String state;
	
	private String country;
	public Address() {
		super();
	}
	public Address(String laneName, String city, String state, String country) {
		super();
		this.laneName = laneName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getLaneName() {
		return laneName;
	}
	public void setLaneName(String laneName) {
		this.laneName = laneName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [laneName=" + laneName + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
