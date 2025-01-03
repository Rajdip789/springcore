package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//we need to use componentScan when we are using @Component to annotate our class
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student", "temp", "conn"})
	public Student getStudent() {
		//creating a new student object
		Student student = new Student(getSamosa());
		
		return student;
	}
}
