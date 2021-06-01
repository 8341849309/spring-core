package com.nt.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.ProductBO;

@Repository("dao")
public class ProductDAOImpl implements IProductDAO {

	@Autowired
	@Qualifier("dmds")
	private DataSource ds;

	@Override
	public String insert(ProductBO bo) throws SQLException, Exception {

		int num=0;
		
		bo.setpId(num+=1);
		
		if (ds.getConnection() != null)
			return "Data inserted..." + bo;
		else
			return "Not inserted...";

	}

}
