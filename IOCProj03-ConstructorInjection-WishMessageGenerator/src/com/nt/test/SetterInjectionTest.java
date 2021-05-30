package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(res);

		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("welcome");

		System.out.println(generator.generateWishMessage("Venkateswarlu"));

	}

}
