package com.bridgelabz.main;

public class RideRepository {
	int userID;
	Ride[] rides;

	public RideRepository(int userID, Ride[] rides) {
		this.userID = userID;
		this.rides = rides;
	}

}
