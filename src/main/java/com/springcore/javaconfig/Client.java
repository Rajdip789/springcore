package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("conn", Student.class);
		System.out.println(student);
		student.study();
		
		context.close();
	}
}
