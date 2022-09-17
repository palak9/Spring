package com.spring.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Library {

	private String cityLocation;
	private int pincode;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Library [cityLocation=" + cityLocation + ", pincode=" + pincode + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("[Library] Inside Init.. ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("[Library] Inside destroy..");
	}
	
}
