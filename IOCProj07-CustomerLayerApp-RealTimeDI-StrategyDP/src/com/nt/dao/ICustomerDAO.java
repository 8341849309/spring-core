package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO {
	public String insert(CustomerBO bo) throws SQLException, Exception;
}
