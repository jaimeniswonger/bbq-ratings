package com.keyholesoftware.restaurants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.keyholesoftware.restaurants.model.Restaurant;

/**
 * @author Jaime Niswonger
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class RestaurantApp extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Restaurant.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApp.class, args);
	}
}
