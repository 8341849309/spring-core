package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.PersonInfo;

public class NullInjectTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		PersonInfo p1 = factory.getBean("venkat", PersonInfo.class);
		System.out.println(p1);
		PersonInfo p2 = factory.getBean("kishore", PersonInfo.class);
		System.out.println(p2);
	}

}
