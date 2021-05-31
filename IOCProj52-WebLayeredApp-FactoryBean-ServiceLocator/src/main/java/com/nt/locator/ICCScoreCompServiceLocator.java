package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.nt.external.ICCScoreComponentImpl;
import com.nt.external.IICCScoreComponent;

@Component("serLocator")
public class ICCScoreCompServiceLocator implements FactoryBean<IICCScoreComponent> {

	public ICCScoreCompServiceLocator() {
		System.out.println("ICCScoreCompServiceLocator.ICCScoreCompServiceLocator()");
	}
	
	public IICCScoreComponent getObject() throws Exception {
		IICCScoreComponent comp = new ICCScoreComponentImpl();
		return comp;
	}

	public Class<ICCScoreComponentImpl> getObjectType() {
		return ICCScoreComponentImpl.class;
	}

}
