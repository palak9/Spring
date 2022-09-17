package com.spring.springcore.ci;

public class Company {

	String companyName;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}

}
