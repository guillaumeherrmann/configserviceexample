package com.ghdeveloper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DisplayConfig implements CommandLineRunner {
	
	private final String greetings;

	public DisplayConfig(final String greetings) {
		this.greetings = greetings;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Greetings = " + greetings);
	}
	
}
