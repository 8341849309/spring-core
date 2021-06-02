package com.nt.editor;

import java.beans.PropertyEditorSupport;
import java.text.NumberFormat;
import java.util.Locale;

import com.nt.beans.Price;

public class PriceEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String price) throws IllegalArgumentException {

		Locale locale = new Locale("hi","IN");

		System.out.println(locale.getDisplayCountry()+"..."+locale.getDisplayLanguage());
		
		float priceNum=Float.parseFloat(price);
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(priceNum);

		Price p = new Price();
		p.setPrice(currency);
		setValue(p);
	}
}
