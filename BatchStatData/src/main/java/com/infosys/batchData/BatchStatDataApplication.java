package com.infosys.batchData;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BatchStatDataApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BatchStatDataApplication.class);
		 app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8080"));
		        app.run(args);
	}


}
