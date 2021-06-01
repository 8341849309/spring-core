package com.nt.editor;

import java.beans.PropertyEditorSupport;

import com.nt.beans.InterestAmtDetails;

public class InterestAmtDetailsEditor extends PropertyEditorSupport {

	public InterestAmtDetailsEditor() {
		System.out.println("InterestAmtDetailsEditor.InterestAmtDetailsEditor()");
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		System.out.println("InterestAmtDetailsEditor.setAsText()");

		String[] values = text.split(",");

		float amt = Float.parseFloat(values[0]);
		float time = Float.parseFloat(values[1]);
		float rate = Float.parseFloat(values[2]);

		InterestAmtDetails det = new InterestAmtDetails();
		det.setAmt(amt);
		det.setTime(time);
		det.setRate(rate);

		// set InterestAmtDetails obj as the value to bean property
		setValue(det);

	}

}
