package com.keyholesoftware.ratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.keyholesoftware.ratings.model.Rating;

/**
 * @author Jaime Niswonger
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class RatingsApp extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Rating.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RatingsApp.class, args);
	}
}
