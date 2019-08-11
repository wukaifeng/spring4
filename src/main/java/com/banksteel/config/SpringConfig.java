package com.banksteel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.banksteel.service.impl"})
// @ComponentScan({"com.banksteel.service.impl"})
public class SpringConfig {

}
