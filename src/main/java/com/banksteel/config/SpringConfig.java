package com.banksteel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.banksteel.service.CompactDisc;
import com.banksteel.service.UserService;
import com.banksteel.service.impl.CompactDiscImpl;
import com.banksteel.service.impl.UserServiceImpl;

@Configuration
@ComponentScan(basePackages= {"com.banksteel.service.impl"})
// @ComponentScan({"com.banksteel.service.impl"})
// 导入配置类,支持数组
//@Import(SpringConfig.class)
//@ImportResource("classpath:/com/acme/properties-config.xml")
public class SpringConfig {

	@Bean
	public CompactDisc getCompactDisc() {
		return new CompactDiscImpl();
	}
	
	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
	
}
