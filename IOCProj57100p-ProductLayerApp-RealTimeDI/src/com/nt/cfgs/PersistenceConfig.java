package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistenceConfig {

	@Bean("dmds")
	public DataSource createDS() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;
	}
}
