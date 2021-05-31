package com.nt.external;

import org.springframework.stereotype.Component;

@Component("scoreComp")
public class ICCScoreComponentImpl implements IICCScoreComponent {

	public ICCScoreComponentImpl() {
		System.out.println("ICCScoreComponentImpl.ICCScoreComponentImpl()");
	}

	public String getScore(int mid) {
		if (mid == 1001)
			return "IND vs PAK ::  300/4 (Ind) ";
		else if (mid == 1002)
			return "AUS vs ENG ::  260/4 (ENG) ";
		else if (mid == 1003)
			return "WI vs NZ ::  300/4 (WI) ";
		else
			throw new IllegalArgumentException("Invalid Match Id");
	}

}
