package com.spring.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceInjectionTest {

	public static void main(String[] args) {

		System.out.println("Injecting reference type..");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/ref/ref-setter-injection.xml");

		ClassA classAObject = (ClassA) context.getBean("aref");
		System.out.println(classAObject.toString());
	}

}
