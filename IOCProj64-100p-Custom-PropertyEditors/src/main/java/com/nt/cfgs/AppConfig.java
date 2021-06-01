package com.nt.cfgs;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.InterestAmtDetails;
import com.nt.editor.InterestAmtDetailsEditor;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {

	@Bean
	public CustomEditorConfigurer createCustomEditor() {
		CustomEditorConfigurer cec = new CustomEditorConfigurer();
		
		Map<Class<?>, Class<? extends PropertyEditor>> map = new HashMap<>();
		map.put(InterestAmtDetails.class, InterestAmtDetailsEditor.class);

		cec.setCustomEditors(map);
		
		return cec;
	}

}
