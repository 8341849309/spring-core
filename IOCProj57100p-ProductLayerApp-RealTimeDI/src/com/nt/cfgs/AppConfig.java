package com.nt.cfgs;

import org.springframework.context.annotation.Import;

@Import(value = { PersistenceConfig.class, ServiceConfig.class, PresentationConfig.class })
public class AppConfig {

}
