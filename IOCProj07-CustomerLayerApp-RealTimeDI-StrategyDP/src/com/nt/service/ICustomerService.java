package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.CustomerDTO;

public interface ICustomerService {
	public String insertCustomer(CustomerDTO dto) throws SQLException, Exception;
}
