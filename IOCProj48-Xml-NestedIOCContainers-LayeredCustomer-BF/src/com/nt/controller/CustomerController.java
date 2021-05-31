package com.nt.controller;

import java.sql.SQLException;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVO;

public class CustomerController {

	private ICustomerService service;

	public void setService(ICustomerService service) {
		this.service = service;
	}

	public String processData(CustomerVO vo) throws SQLException, Exception {
		// convert vo o dto
		CustomerDTO dto = new CustomerDTO();
		dto.setCustId(Integer.parseInt(vo.getCustId()));
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setBillAmt(Float.parseFloat(vo.getBillAmt()));

		return service.insertCustomer(dto);

	}

}
