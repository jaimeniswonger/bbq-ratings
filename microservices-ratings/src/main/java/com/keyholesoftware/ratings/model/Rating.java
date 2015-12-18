package com.keyholesoftware.ratings.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Jaime Niswonger
 */
@Entity
@Data
public class Rating {

	@Id
	@GeneratedValue
	Long id;

	private long restaurantId;

	private Scale taste;
	private Scale tenderness;
	private Scale appearance;
}
