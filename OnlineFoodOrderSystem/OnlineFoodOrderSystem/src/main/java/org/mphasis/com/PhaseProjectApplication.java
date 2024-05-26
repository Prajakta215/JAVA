package org.mphasis.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"org.mphasis.controller","org.mphasis.service"})
@EnableJpaRepositories("org.mphasis.repository")
@EntityScan("org.mphasis.model")
public class PhaseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhaseProjectApplication.class, args);
	}

}
