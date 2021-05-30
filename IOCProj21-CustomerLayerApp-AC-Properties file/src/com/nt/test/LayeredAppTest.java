package com.nt.test;

import java.sql.SQLException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		CustomerController ctr = ctx.getBean("controller", CustomerController.class);

		CustomerVO vo = new CustomerVO();
		vo.setCustId("101");
		vo.setCustName("Venkateswarlu");
		vo.setCustAddrs("Madanapalle");
		vo.setBillAmt("112.3");
		
		
		Environment  env=((ClassPathXmlApplicationContext)ctx).getEnvironment();
		System.out.println(env.getClass());
		System.out.println(env.getProperty("os.name"));
		System.out.println("PATH::"+env.getProperty("PATH")+"\n CLASSPATH::"+env.getProperty("CLASSPATH"));
	
		try {
			System.out.println(ctr.processData(vo));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) ctx).close();
		
	}

}
