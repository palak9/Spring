package com.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Setter Injection..");
		ApplicationContext setterContext = new ClassPathXmlApplicationContext("setter-injection.xml");
		Student student1 = (Student) setterContext.getBean("student1");
		System.out.println(student1.toString());

	}
}
