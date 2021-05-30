package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.SampleBean;

public class DefaultBeanIdTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		
		Date d1=factory.getBean("java.util.Date#0", Date.class);
		System.out.println(d1);
		System.out.println("================================================");
		
		Date d2=factory.getBean("java.util.Date#0", Date.class);
		System.out.println(d2);
		System.out.println("================================================");
		
		Date d3=factory.getBean("java.util.Date#1", Date.class);
		System.out.println(d3);
		System.out.println("================================================");
		
		SampleBean s1=factory.getBean("com.nt.comp.SampleBean",SampleBean.class);
		System.out.println(s1);
		System.out.println("================================================");
		
		SampleBean s2=factory.getBean("com.nt.comp.SampleBean#0",SampleBean.class);
		System.out.println(s2);
		System.out.println("================================================");
		
		SampleBean s3=factory.getBean("com.nt.comp.SampleBean#1",SampleBean.class);
		System.out.println(s3);
		System.out.println("================================================");
		
		SampleBean s4=factory.getBean("com.nt.comp.SampleBean#2",SampleBean.class);
		System.out.println(s4);
		System.out.println("================================================");
		
		
	}

}
