package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Person;

@SpringBootApplication
public class ConfigurationPropertiesTest {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesTest.class, args);

		Person per = ctx.getBean("person", Person.class);
		System.out.println(per);

		((ConfigurableApplicationContext) ctx).close();
	}

}
