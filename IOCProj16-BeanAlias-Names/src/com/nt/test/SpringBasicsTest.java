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
		wel.welcome("welcome::"+"Venkateswarlu");
		System.out.println("==============================");

		WelcomeGreetings wel1=(WelcomeGreetings) factory.getBean("wg1");
		wel1.welcome("wg1::"+"Venkateswarlu");
		System.out.println("==============================");

		WelcomeGreetings wel2=(WelcomeGreetings) factory.getBean("wg2");
		wel2.welcome("wg2::"+"Venkateswarlu");
		System.out.println("==============================");

		WelcomeGreetings wel3=(WelcomeGreetings) factory.getBean("wg3");
		wel3.welcome("wg3::"+"Venkateswarlu");
		System.out.println("==============================");
		
	//	Date d=factory.getBean("java.util.Date", Date.class);// does not exists
		Date d=factory.getBean("d", Date.class);
		System.out.println(d);
		
	}

}
