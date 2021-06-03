package com.nt.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVO;

@Controller("controller")
public class CustomerController {
	
	@Autowired
	@Qualifier("service")
	private ICustomerService service;
	
	public CustomerController() {
		System.out.println("CustomerController.CustomerController()");
	}
	
	public String processData(CustomerVO vo) throws SQLException, Exception {
		//convert vo o dto
		CustomerDTO dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setBillAmt(Float.parseFloat(vo.getBillAmt()));
		
			
		
		return service.insertCustomer(dto);
		
		
	}
	
}
