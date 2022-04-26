package com.dung.k8sexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class K8sExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sExampleApplication.class, args);
	}

}
