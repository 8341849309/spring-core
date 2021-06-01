package com.nt.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("dao")
public class CustomerDAOImpl implements ICustomerDAO {

	@Autowired
	@Qualifier("dmds")
	private DataSource ds;

	@Override
	public String insert(CustomerBO bo) throws SQLException, Exception {

		if (ds.getConnection() != null)
			return "Data inserted..." + bo;
		else
			return "Not inserted...";

	}

}
