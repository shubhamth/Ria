package com.ria.riaadvisoryassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication   
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.ria"})
@EnableJpaRepositories(basePackages="com.ria.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.ria.model")
@ComponentScan("com.ria.services")
public class RiaAdvisoryAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiaAdvisoryAssignmentApplication.class, args);
	}

}
