package com.spring.springcore.lifecycle;

public class Book {

	private String name;
	private int pages;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	
	public void initMe() {
		System.out.println("Initializing bean..");
	}
	
	
	public void destroyMe() {
		System.out.println("Releasing resources..");
	}

}
