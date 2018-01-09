package com.oraclejava.spring.sample;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrinkTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IPerson person = (IPerson) ctx.getBean("mink");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("나이 입력 : ");
			
			person.setAge(sc.nextInt());
			
			int age = person.getAge();
			
			if(age == 0)
				break;
		}
	}
}
