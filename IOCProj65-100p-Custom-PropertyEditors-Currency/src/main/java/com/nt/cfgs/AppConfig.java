package com.nt.cfgs;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nt.beans.Price;
import com.nt.editor.PriceEditor;

@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource(value = "com/nt/commons/info.properties")
public class AppConfig {

	@Bean
	public static CustomEditorConfigurer createCustomEditor() {
		CustomEditorConfigurer c = new CustomEditorConfigurer();

		Map<Class<?>, Class<? extends PropertyEditor>> map = new HashMap<>();
		map.put(Price.class, PriceEditor.class);

		c.setCustomEditors(map);

		return c;
	}
}
