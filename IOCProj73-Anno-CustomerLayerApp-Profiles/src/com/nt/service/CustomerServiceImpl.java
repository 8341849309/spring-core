package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

@Service("service")
@Scope("singleton")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO dao;

	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl.CustomerServiceImpl()");
	}

	@Override
	public String insertCustomer(CustomerDTO dto) throws SQLException, Exception {

		CustomerBO bo = new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setBillAmt(dto.getBillAmt());

		return dao.insert(bo);
	}

}
