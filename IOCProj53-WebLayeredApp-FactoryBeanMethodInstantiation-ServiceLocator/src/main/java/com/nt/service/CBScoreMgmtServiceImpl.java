package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.external.IICCScoreComponent;

@Service("ser")
public class CBScoreMgmtServiceImpl implements ICBScoreMgmtService {

	@Autowired
	@Qualifier("serLocator")
	private IICCScoreComponent scoreComp;

	public CBScoreMgmtServiceImpl() {
		System.out.println("CBScoreMgmtServiceImpl.CBScoreMgmtServiceImpl()");
	}
	
	public String findScore(int mid) {
		
		String score = scoreComp.getScore(mid);
		
		return score;
	}

}
