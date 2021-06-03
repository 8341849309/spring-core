package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	@Bean("dmds")
	@Profile({"dev","test"})
	public DriverManagerDataSource createDMDS() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl("jdbc:mysql:///spring");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;
	}
	
	@Bean("hikariDS")
	@Profile({"uat","prod"})
	public HikariDataSource createHikariDS() {
		HikariDataSource ds=new HikariDataSource();
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
}
