package com.banksteel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.banksteel.bean.Car;
import com.banksteel.bean.Person;
import com.banksteel.bean.Person2;
import com.banksteel.config.SpringConfig;
import com.banksteel.service.CompactDisc;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringConfig.class})
// @ContextConfiguration(locations={ "classpath*:applicationContext.xml" })
@ActiveProfiles("dev")
public class AppTest extends TestCase {
	@Autowired
	private CompactDisc compactDisc;
	
	@Resource
	private Car carRef;
	@Resource
	private Car carRef2;
	@Resource
	private Person personRef;
	@Resource
	private Person personRef2;
	@Resource
	private Person2 person2Profile;
	
	@Test
	public void test1() {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		compactDisc.play();
	}
	
	@Test
	public void test2() {
		System.out.println("carRef:" + carRef);
	}
	@Test
	public void test3() {
		System.out.println("carRef2:" + carRef2);
	}
	@Test
	public void test4() {
		System.out.println("personRef:" + personRef);
	}
	@Test
	public void test5() {
		System.out.println("personRef2:" + personRef2);
	}
	@Test
	public void test6() {
		System.out.println("person2Profile:" + person2Profile);
	}
}
