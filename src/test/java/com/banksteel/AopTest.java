package com.banksteel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.banksteel.aop.service.Sleepable;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath*:applicationContext_aop.xml" })
public class AopTest extends TestCase {
	@Resource
	private Sleepable me;
	
	@Test
	public void test1() {
		me.test1("zhangsan", 12);
	}
	@Test
	public void test2() {
		me.sleep();
	}
}
