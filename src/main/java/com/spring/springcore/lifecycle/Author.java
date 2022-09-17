package com.spring.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Author implements InitializingBean, DisposableBean{

	private String name;
	private int age;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is used for initialising.. init()");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This method will function destroy()..");
	}

}
