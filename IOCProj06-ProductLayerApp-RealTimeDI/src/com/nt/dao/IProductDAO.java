package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.ProductBO;

public interface IProductDAO {
	public String insert(ProductBO bo) throws SQLException, Exception;
}
