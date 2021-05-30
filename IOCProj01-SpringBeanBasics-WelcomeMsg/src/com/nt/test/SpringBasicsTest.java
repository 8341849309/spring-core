package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class SpringBasicsTest {

	public static void main(String[] args) {
		
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(res);
		
		//get beans
		WelcomeGreetings wel=(WelcomeGreetings) factory.getBean("welcome");
		wel.welcome("Venkateswarlu");
		
		Date date=(Date) factory.getBean("date");
		System.out.println("Date Obj:: "+date);
		
	}

}
