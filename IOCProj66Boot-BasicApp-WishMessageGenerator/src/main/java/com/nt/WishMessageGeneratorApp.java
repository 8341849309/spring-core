package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class WishMessageGeneratorApp {

	@Bean("dt")
	public LocalDateTime createDate() {

		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(WishMessageGeneratorApp.class, args);
		
		WishMessageGenerator generator=ctx.getBean("wMsg",WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("Venkateswarlu"));
	
		((ConfigurableApplicationContext) ctx).close();
	}

}
