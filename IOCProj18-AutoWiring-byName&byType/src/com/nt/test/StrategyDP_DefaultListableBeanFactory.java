package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.vehicle.Vehicle;

public class StrategyDP_DefaultListableBeanFactory {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		Vehicle veh = (Vehicle) factory.getBean("vehicle");
		veh.move("Madanapalle", "Hyderabad");

	}

}
