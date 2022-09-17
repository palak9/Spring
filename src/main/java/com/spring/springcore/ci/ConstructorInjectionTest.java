package com.spring.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		System.out.println("Constructor Injection..");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/ci/ci-setter-injection.xml");
		Developer dev1 = (Developer) context.getBean("dev1");
		Developer dev2 = (Developer) context.getBean("dev2");

		System.out.println(dev1.toString());
		System.out.println(dev2.toString());

	}

}
