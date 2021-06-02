package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Product {
	@Value("${product.name}")
	private String name;
	@Value("${product.price}")
	private Price price;

}
