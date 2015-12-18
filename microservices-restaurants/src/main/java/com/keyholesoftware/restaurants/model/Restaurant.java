package com.keyholesoftware.restaurants.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Jaime Niswonger
 */
@Entity
@Data
public class Restaurant {

	@Id @GeneratedValue Long id;
	String name;
	Address address;
}
