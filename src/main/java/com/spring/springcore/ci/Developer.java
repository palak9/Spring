package com.spring.springcore.ci;

public class Developer {

	private String name;
	private int experience;
	private Company company;

	public Developer(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

	public Developer(String name, int experience, Company company) {
		super();
		this.name = name;
		this.experience = experience;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", experience=" + experience + ", company=" + company + "]";
	}

}
