package com.keyholesoftware.ratings.model;

public enum Scale {

	EXCELLENT(9), VERY_GOOD(8), ABOVE_AVERAGE(7), AVERAGE(6), BELOW_AVERAGE(5), POOR(4), BAD(3), INEDIBLE(2);

	private long points;

	Scale(long points) {
		this.points = points;
	}

	long points() {
		return this.points;
	}
}
