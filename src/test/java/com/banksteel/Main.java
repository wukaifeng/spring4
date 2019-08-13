package com.banksteel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.banksteel.bean.BeanCycle;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans-cycle.xml");
		BeanCycle beanCycle = (BeanCycle) context.getBean("cycle");
		
		System.out.println(beanCycle);
		context.close();
	}
	
	
}
