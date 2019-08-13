package com.banksteel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.banksteel.bean.Car;
import com.banksteel.bean.Person;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//SpringHelloWorld springHelloWorld = context.getBean(SpringHelloWorld.class);
		SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("com.banksteel.SpringHelloWorld");
		String name = springHelloWorld.getName();
		System.out.println("name:" + name);
		Car car = (Car) context.getBean("car1");
		System.out.println(car);
		
		Person person = (Person) context.getBean("person");
		
		System.out.println(person);
		
	
		Car car3 = (Car) context.getBean("car3");
		System.out.println(car3);
		
		Person person2 = (Person) context.getBean("person2");
		
		System.out.println(person2);
		
		Person person3 = (Person) context.getBean("person3");
		
		System.out.println(person3);
		
	} 
}
