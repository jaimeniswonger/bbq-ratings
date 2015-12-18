package com.keyholesoftware.ratings.model;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Jaime Niswonger
 */
public interface RatingRepository extends PagingAndSortingRepository<Rating, Long> {
}
