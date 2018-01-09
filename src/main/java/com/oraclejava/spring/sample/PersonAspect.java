package com.oraclejava.spring.sample;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Aspect Oriented Programming
// 시점 + 처리
@Aspect	// JoinPoint + Advice
public class PersonAspect {
	// 사전처리
	@Before("execution(* getName())")					// Pointcut : execution 내
	public void getNameBefore() {
		System.out.println("###### getName before");	// Advice : 실행내용
	}
	
	/*
	@Before("execution(* getAge())")
	public void getAgeBefore() {
		
		System.out.println("###### getAge before");
	}
	*/
	
	// 사후처리
	@AfterReturning(pointcut = "execution(* getName())", returning="retVal")
	public void getNameAfter(Object retVal) {
		String name = retVal.toString();
		System.out.println("###### retVal : " + name);
	}
	
	@AfterReturning(pointcut = "execution(* getAge())", returning="retVal")
	public void getAgeBefore(Object retVal) {
		int age = Integer.parseInt(retVal.toString());
		//int age = retVal;
		
		if(age >= 20)
			System.out.println("###### 음주 가능");
		else
			System.out.println("###### 음주 불가");
	}	
}
