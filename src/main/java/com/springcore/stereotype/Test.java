package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		
		//Student st1 = context.getBean("student", Student.class);
		Student st1 = context.getBean("ob1", Student.class);
		System.out.println(st1);
		System.out.println(st1.getAddress().getClass().getName());
		
		System.out.println(st1.hashCode());
		
		System.out.println(context.getBean("ob1", Student.class).hashCode());
		
		//Thus spring container returns same object again and again -- singleton scope	
		//use protoype in scope annotaion or in bean to use prototype scope
		
		System.out.println(context.getBean("teacher").hashCode());
		System.out.println(context.getBean("teacher").hashCode());
		
	}
}

