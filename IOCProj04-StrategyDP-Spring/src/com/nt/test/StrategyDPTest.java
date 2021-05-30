package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.vehicle.Vehicle;


public class StrategyDPTest {

	public static void main(String[] args) {

		Resource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		Vehicle veh=(Vehicle) factory.getBean("vehicle");
		veh.move("Madanapalle", "Hyderabad");

	}

}
