package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.ProductBO;
import com.nt.dao.IProductDAO;
import com.nt.dto.ProductDTO;

@Service("ser")
public class ProductServiceImpl implements IProductService {

	@Autowired
	@Qualifier("dao")
	private IProductDAO dao;
	
	@Override
	public String insertProduct(ProductDTO dto) throws SQLException, Exception {
		ProductBO bo=new ProductBO();
		bo.setpName(dto.getpName());
		bo.setQuantity(dto.getQuantity());
		bo.setBasePrice(dto.getBasePrice());
		bo.setType(dto.getType());
		bo.setStatus(dto.getStatus());
		
		float basePrice=dto.getBasePrice();
		double gst;
		
		if(basePrice<50)
			gst=basePrice*0.12;
		else if(basePrice<100)
			gst=basePrice*0.15;
		else
			gst=basePrice*0.18;
		
		bo.setMRP(basePrice+gst);
		
		return dao.insert(bo);
	}

}
