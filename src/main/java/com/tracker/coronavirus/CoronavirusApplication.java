package com.tracker.coronavirus;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling
public class CoronavirusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusApplication.class, args);
	}

}
