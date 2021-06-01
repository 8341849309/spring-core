package com.nt.locator;

import com.nt.external.ICCScoreComponentImpl;
import com.nt.external.IICCScoreComponent;

public class ICCScoreCompServiceLocator {

	public ICCScoreCompServiceLocator() {
		System.out.println("ICCScoreCompServiceLocator.ICCScoreCompServiceLocator()");
	}

	public static IICCScoreComponent getExternalServiceComp() {
		IICCScoreComponent comp = new ICCScoreComponentImpl();
		return comp;
	}

}
