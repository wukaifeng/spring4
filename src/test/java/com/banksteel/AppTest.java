package com.banksteel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.banksteel.config.SpringConfig;
import com.banksteel.service.CompactDisc;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringConfig.class})
// @ContextConfiguration(locations={ "classpath*:applicationContext.xml" })
public class AppTest extends TestCase {
	@Autowired
	private CompactDisc compactDisc;
	@Test
	public void test1() {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		compactDisc.play();
	}
}
