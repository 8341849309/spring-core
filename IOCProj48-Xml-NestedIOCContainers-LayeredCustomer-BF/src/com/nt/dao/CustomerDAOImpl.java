package com.nt.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {

	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public String insert(CustomerBO bo) throws SQLException, Exception {

		if (ds.getConnection() != null)
			return "Data inserted..." + bo;
		else
			return "Not inserted...";

	}

}
