package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

@Service("service")
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	@Qualifier("dao")
	private ICustomerDAO dao;

	@Override
	public String insertCustomer(CustomerDTO dto) throws SQLException, Exception {
		
		CustomerBO bo=new CustomerBO();
		bo.setCustId(dto.getCustId());
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setBillAmt(dto.getBillAmt());
		
		return dao.insert(bo);
	}

}
