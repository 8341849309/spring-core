package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.ProductDTO;

public interface IProductService {
	public String insertProduct(ProductDTO dto) throws SQLException, Exception;
}
