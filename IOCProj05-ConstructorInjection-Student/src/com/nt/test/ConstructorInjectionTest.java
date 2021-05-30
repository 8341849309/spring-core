package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Student std1=factory.getBean("stu1", Student.class);
		System.out.println(std1);
		
		Student std2=factory.getBean("stu2", Student.class);
		System.out.println(std2);
		
		Student std3=factory.getBean("stu3", Student.class);
		System.out.println(std3);
	}

}
