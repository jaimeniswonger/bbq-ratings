package com.keyholesoftware.restaurants.model;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Jaime Niswonger
 */
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {
}
