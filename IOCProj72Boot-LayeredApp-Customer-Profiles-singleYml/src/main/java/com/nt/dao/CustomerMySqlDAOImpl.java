package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("mySqlDao")
@Scope(value = "singleton")
@Profile({"dev","test"})
public class CustomerMySqlDAOImpl implements ICustomerDAO {

	private static final String INSERT_CUST_DETAILS = "INSERT INTO spring.layered_customer(CUSTNAME,CUSTADDRS,BILLAMT) VALUES(?,?,?) ";

	@Autowired
	private DataSource ds;

	public CustomerMySqlDAOImpl() {
		System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
	}

	
	public String insert(CustomerBO bo) throws SQLException, Exception {

		Connection con = ds.getConnection();

		PreparedStatement ps = con.prepareStatement(INSERT_CUST_DETAILS);
		ps.setString(1, bo.getCustName());
		ps.setString(2, bo.getCustAddrs());
		ps.setFloat(3, bo.getBillAmt());

		int count = ps.executeUpdate();

		ps.close();
		con.close();

		if (count > 0)
			return "Record inserted successfully";
		else
			return "Record insertion failed";

	}

}
