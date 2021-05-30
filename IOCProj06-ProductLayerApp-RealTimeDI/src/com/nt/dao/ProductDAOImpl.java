package com.nt.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.ProductBO;

public class ProductDAOImpl implements IProductDAO {

	private DataSource ds;

	public ProductDAOImpl(DataSource ds) {
		this.ds=ds;
	}

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
