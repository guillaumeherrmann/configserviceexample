package com.ghdeveloper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfigClientBeanDefinition {
	
	@Value("${greetings:Greetings is not defined}")
	String greeting;
	
	@Bean
	public DisplayConfig displayConfig() {
		return new DisplayConfig(greeting);
	}

}
