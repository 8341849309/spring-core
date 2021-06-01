package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.BankLoanIntrestCalculator;
import com.nt.beans.InterestAmtDetails;
import com.nt.editor.InterestAmtDetailsEditor;

public class CustomPropertyEditorTest_BF {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// add new PERegistrar to IOC
		factory.addPropertyEditorRegistrar(new MYPERegistrar());
		

		BankLoanIntrestCalculator blic = factory.getBean("blic", BankLoanIntrestCalculator.class);
		System.out.println(blic.calculateIntrestAmount());

	}

	private static class MYPERegistrar implements PropertyEditorRegistrar {

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {

			registry.registerCustomEditor(InterestAmtDetails.class, new InterestAmtDetailsEditor());
		}// register custom editor

	}

}
