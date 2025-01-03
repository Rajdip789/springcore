package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// registering shutdown hook
		context.registerShutdownHook();
		
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);

		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		Example ex1 = (Example)context.getBean("example1");
		System.out.println(ex1);
	}
}
