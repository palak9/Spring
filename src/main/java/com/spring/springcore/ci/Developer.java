package com.spring.springcore.ci;

import java.util.List;

public class Developer {

	private String name;
	private int experience;
	private Company company;
	private List<String> technologies;

	public Developer(String name, int experience, List<String> technologies) {
		super();
		this.name = name;
		this.experience = experience;
		this.technologies = technologies;
	}

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
		return "Developer [name=" + name + ", experience=" + experience + ", company=" + company + ", technologies="
				+ technologies + "]";
	}

}
