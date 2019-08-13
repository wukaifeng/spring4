package com.banksteel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.banksteel.bean.MagicBean;
import com.banksteel.bean.Person;
import com.banksteel.bean.Person2;
import com.banksteel.conditional.MagicExistsCondition;
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
@PropertySource(value="classpath:env.properties")
public class SpringConfig {

	@Bean
	public CompactDisc getCompactDisc() {
		return new CompactDiscImpl();
	}
	
	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
	
	@Bean("person2Profile")
	@Profile("dev")
	public Person2 getPerson() {
		return new Person2();
	}
	
	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean getMagicBean() {
		return new MagicBean();
	}
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
