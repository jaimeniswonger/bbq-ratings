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
public class Address {

	private final String street, zipCode, city;
	private final Location location;

	protected Address() {

		this.street = null;
		this.zipCode = null;
		this.city = null;
		this.location = null;
	}
}
