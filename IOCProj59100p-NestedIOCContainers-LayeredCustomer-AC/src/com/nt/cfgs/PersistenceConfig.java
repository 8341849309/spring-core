package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class PersistenceConfig {

	@Autowired
	private Environment env;
	
	@Bean("dmds")
	public DataSource createDMDS() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(env.getProperty("jdbc.url"));
		dmds.setUsername(env.getProperty("jdbc.username"));
		dmds.setPassword(env.getProperty("jdbc.password"));
		return dmds;
	}
}
