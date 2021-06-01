package com.nt.locator;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import com.nt.external.IICCScoreComponent;

@Component("serLocator")
public abstract class ICCScoreCompServiceLocator {

	public ICCScoreCompServiceLocator() {
		System.out.println("ICCScoreCompServiceLocator.ICCScoreCompServiceLocator()");
	}

	@Lookup
	public abstract IICCScoreComponent getScoreComp();

	public String getScore(int mid) {
		IICCScoreComponent c = getScoreComp();
		return c.getScore(mid);
	}

}
