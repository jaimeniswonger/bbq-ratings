package com.keyholesoftware.restaurants;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.keyholesoftware.restaurants.RestaurantApp;
import com.keyholesoftware.restaurants.model.Address;
import com.keyholesoftware.restaurants.model.Location;
import com.keyholesoftware.restaurants.model.Restaurant;
import com.keyholesoftware.restaurants.model.RestaurantRepository;

/**
 * @author Jaime Niswonger
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestaurantApp.class)
public class RestaurantRepositoryIntegrationTest {

	@Autowired RestaurantRepository repository;

	@Test
	public void testname() {

		Restaurant restaurant = new Restaurant();
		restaurant.setName("Q39");
		restaurant.setAddress(new Address("street", "zipCode", "city", new Location(55.349451, -131.673817)));

		restaurant = repository.save(restaurant);

		assertThat(repository.findOne(restaurant.getId()), is(restaurant));
	}
}
