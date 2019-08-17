package com.banksteel.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectAdvice {
	
	public void before() {
		System.out.println("======before");
	}
	
	public void after() {
		System.out.println("=======after");
	}
	
	public void throwing(Exception e) {
		System.out.println("=========throwing" +e.getMessage());
	}
	
	public int around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("====around=====before");
		proceedingJoinPoint.proceed();
		System.out.println("====around=====after");
		
		return 1;
	}

}
