package com.spring.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("Setter Injection :: Collection Types");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/collections/collection-setter-injection.xml");
		Employee employee = (Employee) context.getBean("employee1");
		System.out.println(employee.toString());

	}
}
