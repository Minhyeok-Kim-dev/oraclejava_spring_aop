package com.oraclejava.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IPerson person = (IPerson) ctx.getBean("mink");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}

}
