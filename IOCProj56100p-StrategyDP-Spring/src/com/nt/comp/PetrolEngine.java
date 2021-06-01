package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}

}
