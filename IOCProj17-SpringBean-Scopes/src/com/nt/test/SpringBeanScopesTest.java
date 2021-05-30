package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WelcomeGreetings;

public class SpringBeanScopesTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		WelcomeGreetings wg1 = factory.getBean("wg1", WelcomeGreetings.class);
		WelcomeGreetings wg2 = factory.getBean("wg1", WelcomeGreetings.class);

		WelcomeGreetings wg3 = factory.getBean("wg2", WelcomeGreetings.class);

		System.out.println("wg1::" + wg1.hashCode() + " wg2::" + wg2.hashCode() + " wg3::" + wg3.hashCode());

		System.out.println("==============================");

		Date d1 = factory.getBean("dt", Date.class);
		Date d2 = factory.getBean("dt", Date.class);
		Date d3 = factory.getBean("dt", Date.class);

		//some times different objs also gives same hashcode
		System.out.println("d1::" + d1.hashCode() + " d2::" + d2.hashCode() + " d3::" + d3.hashCode());
		System.out.println("d1==d2"+(d1==d2)+"::"+"d2==d3"+(d2==d3));
		
	}

}
