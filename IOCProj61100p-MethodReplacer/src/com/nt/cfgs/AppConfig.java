package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
public class AppConfig {

}
