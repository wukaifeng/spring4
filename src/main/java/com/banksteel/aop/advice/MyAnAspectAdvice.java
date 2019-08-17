package com.banksteel.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAnAspectAdvice {
	@Pointcut("execution(* com.banksteel.aop.service.impl.Me.*(..))")
	public void pointCut() {}
	
	
	@Before(value="pointCut()")
	public void before() {
		System.out.println("======before");
	}
	@After(value="pointCut()")
	public void after() {
		System.out.println("=======after");
	}
	
	@AfterThrowing(value="pointCut()",throwing="e")
	public void throwing(Exception e) {
		System.out.println("=========throwing" +e.getMessage());
	}
	@Around(value="pointCut()")
	public int around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("====around=====before");
		proceedingJoinPoint.proceed();
		System.out.println("====around=====after");
		
		return 1;
	}



}
