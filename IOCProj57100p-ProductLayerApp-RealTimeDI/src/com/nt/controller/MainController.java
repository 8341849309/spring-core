package com.nt.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.dto.ProductDTO;
import com.nt.service.IProductService;
import com.nt.vo.ProductVO;

@Component("controller")
public class MainController {
	
	@Autowired
	@Qualifier("ser")
	private IProductService ser;

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
