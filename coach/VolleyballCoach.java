package com.vasanth.springworkshop.coach;

import com.vasanth.springworkshop.diet.Diet;

public class VolleyballCoach implements Coach {
	
	Diet diet;

	@Override
	public void getWorkout() {
		System.out.println("Shuttle run for 30 minutes!");

	}

	@Override
	public void getDietPlan() {
		diet.getDietPlan();

	}

}
