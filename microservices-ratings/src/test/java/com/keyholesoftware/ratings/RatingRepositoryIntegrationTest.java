package com.keyholesoftware.ratings;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.keyholesoftware.ratings.model.Rating;
import com.keyholesoftware.ratings.model.RatingRepository;
import com.keyholesoftware.ratings.model.Scale;

/**
 * @author Jaime Niswonger
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RatingsApp.class)
public class RatingRepositoryIntegrationTest {

	@Autowired RatingRepository repository;

	@Test
	public void test() {

		Rating rating = new Rating();
		rating.setRestaurantId(1);
		rating.setTaste(Scale.EXCELLENT);
		rating.setTenderness(Scale.EXCELLENT);
		rating.setAppearance(Scale.EXCELLENT);

		rating = repository.save(rating);

		assertThat(repository.findOne(rating.getId()), is(rating));
	}
}
