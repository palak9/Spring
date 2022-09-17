package com.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Setter Injection :: 1");
		ApplicationContext setterContext = new ClassPathXmlApplicationContext("setter-injection.xml");
		Student student1 = (Student) setterContext.getBean("student1");
		System.out.println(student1.toString());

		System.out.println("Setter Inejction :: 2");
		Student student2 = (Student) setterContext.getBean("student2");
		System.out.println(student2.toString());
		
		System.out.println("Setter injection :: 3 - P Schema");
		Student student3 = (Student) setterContext.getBean("student3");
		System.out.println(student3.toString());
		
	}
}
