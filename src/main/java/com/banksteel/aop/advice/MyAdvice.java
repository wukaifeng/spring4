package com.banksteel.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class MyAdvice implements ThrowsAdvice, MethodBeforeAdvice, AfterReturningAdvice, AfterAdvice, MethodInterceptor {

	@Override
	public void before(Method method, Object[] arg1, Object obj) throws Throwable {
		System.out.println("切点方法名method:" + method.getName());
		System.out.println("切点方法参数:" + arg1);
		System.out.println("切点对象:" + obj);
		System.out.println("执行前置通知！");
		
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行后置通知！" + returnValue);
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("环绕通知前！");
		Object rval = invocation.proceed();
		System.out.print("环绕通知后!");
		return rval;
	}
	
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.print("异常通知!");
    }

}
