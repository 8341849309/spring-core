package com.nt.cfgs;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
	
	@Bean("dt")
	public Date createDate() {
		return new Date();
	}
	
}
