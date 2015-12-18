package com.keyholesoftware.restaurants.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * @author Jaime Niswonger
 */
@Value
@Embeddable
@AllArgsConstructor
public class Location {

	private final double latitude, longitude;

	protected Location() {
		this.latitude = 0.0;
		this.longitude = 0.0;
	}
}
