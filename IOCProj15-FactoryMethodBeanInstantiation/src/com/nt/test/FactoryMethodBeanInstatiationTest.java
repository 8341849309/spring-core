package com.nt.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstatiationTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Calendar cal=factory.getBean("cal", Calendar.class);
		System.out.println("obj class:: "+cal.getClass()+" Obj data:: "+cal.toString());
		System.out.println("============================");
		
		Class clazz=factory.getBean("clazz", Class.class);
		System.out.println("obj class:: "+clazz.getClass()+" Obj data:: "+clazz.toString());
		System.out.println("============================");
		
		Properties props=factory.getBean("props", Properties.class);
		System.out.println("obj class:: "+props.getClass()+" Obj data:: "+props.toString());
		System.out.println("============================");
		
		
		String str1=factory.getBean("s2", String.class);
		System.out.println("obj class:: "+str1.getClass()+" Obj data:: "+str1.toString());
		System.out.println("============================");
		
		String str2=factory.getBean("s3", String.class);
		System.out.println("obj class:: "+str2.getClass()+" Obj data:: "+str2.toString());
		System.out.println("============================");
		
		Iterator itr=factory.getBean("itr", Iterator.class);
		System.out.println("obj class:: "+itr.getClass()+" Obj data:: "+itr.toString());
		System.out.println("============================");
		
	}

}
