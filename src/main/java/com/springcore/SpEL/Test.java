package com.springcore.SpEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpEL/config.xml");
		
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		//Not widely used
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("34*34");
		System.out.println(expression.getValue());
		
		context.close();
	}
}
