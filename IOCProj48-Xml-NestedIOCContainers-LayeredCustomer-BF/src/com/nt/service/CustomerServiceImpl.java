package com.nt.service;

import java.sql.SQLException;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDAO dao;

	public void setDao(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String insertCustomer(CustomerDTO dto) throws SQLException, Exception {

		CustomerBO bo = new CustomerBO();
		bo.setCustId(dto.getCustId());
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setBillAmt(dto.getBillAmt());

		return dao.insert(bo);
	}

}
