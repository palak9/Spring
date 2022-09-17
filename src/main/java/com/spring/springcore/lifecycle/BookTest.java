package com.spring.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/lifecycle/lifecycle-setter.xml");
		context.registerShutdownHook(); // by default Ioc will not call the destroy method.. need to enable it using
										// shutdown
		Book b1 = (Book) context.getBean("book1");
		System.out.println(b1);

	}
}
