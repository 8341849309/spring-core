package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("ElectricEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine.stop()");
	}

}
