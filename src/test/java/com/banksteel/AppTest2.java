package com.banksteel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.banksteel.bean.MagicBean;
import com.banksteel.bean.Person2;
import com.banksteel.config.SpringConfig;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringConfig.class})
@ActiveProfiles("dev")
public class AppTest2 extends TestCase {
	@Resource
	private Person2 person2Profile;
	@Resource
	private MagicBean magicBean;
	
	@Test
	public void test() {
		System.out.println("person2Profile:" + person2Profile);
	}
	
	@Test
	public void test2() {
		System.out.println("magicBean:" + magicBean);
	}
}
