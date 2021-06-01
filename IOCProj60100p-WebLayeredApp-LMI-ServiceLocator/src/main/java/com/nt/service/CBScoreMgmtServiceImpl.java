package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.locator.ICCScoreCompServiceLocator;

@Service("ser")
public class CBScoreMgmtServiceImpl implements ICBScoreMgmtService {

	@Autowired
	@Qualifier("serLocator")
	private ICCScoreCompServiceLocator serv;

	public CBScoreMgmtServiceImpl() {
		System.out.println("CBScoreMgmtServiceImpl.CBScoreMgmtServiceImpl()");
	}

	public String findScore(int mid) {

		String score = serv.getScore(mid);

		return score;
	}

}
