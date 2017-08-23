package com.ghdeveloper;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SimpletaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpletaskApplication.class, args);
	}
	
	@Bean
	public SendMessageTask sendMessageTask() {
		return new SendMessageTask();
	}
	
	public static final class SendMessageTask implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			System.out.print("Got args ");
			Arrays.stream(args).forEach(System.out::println);
		}
	}
}
