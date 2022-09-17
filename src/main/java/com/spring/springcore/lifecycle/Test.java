package com.spring.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("Bean Life Cycle using XML Config..");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/lifecycle/lifecycle-setter.xml");
		context.registerShutdownHook(); // by default Ioc will not call the destroy method.. need to enable it using
										// shutdown
		Book b1 = (Book) context.getBean("book1");
		System.out.println(b1);
		
		System.out.println("Bean Life Cycle using Spring Interfaces..");
		Author author = (Author) context.getBean("author");
		System.out.println(author);
		
		
		System.out.println("Bean life Cycle using Annotations.. ");
		Library lib = (Library) context.getBean("library1");
		System.out.println(lib);
	}
}
