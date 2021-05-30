package com.nt.controller;

import java.sql.SQLException;

import com.nt.dto.ProductDTO;
import com.nt.service.IProductService;
import com.nt.vo.ProductVO;

public class MainController {
	private IProductService ser;

	public MainController(IProductService ser) {
		this.ser = ser;
	}

	public String processData(ProductVO vo) throws SQLException, Exception {
		// convert vo o dto
		ProductDTO dto = new ProductDTO();
		dto.setpName(vo.getpName());
		dto.setBasePrice(Float.parseFloat(vo.getBasePrice()));
		dto.setQuantity(Integer.parseInt(vo.getQuantity()));
		dto.setStatus(vo.getStatus());
		dto.setType(vo.getType());

		return ser.insertProduct(dto);

	}

}
