package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.VoteEligibilityCheck;

public class BeanLifeCycleTest_BF {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory ctx=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(ctx);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		VoteEligibilityCheck vCheck = ctx.getBean("vCheck", VoteEligibilityCheck.class);
		System.out.println(vCheck.checkEligibility());

	}

}
