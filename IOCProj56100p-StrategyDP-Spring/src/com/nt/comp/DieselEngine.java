package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("DieselEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()");
	}

}
