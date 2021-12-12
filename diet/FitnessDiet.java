package com.vasanth.springworkshop.diet;

import org.springframework.stereotype.Component;

@Component
public class FitnessDiet implements Diet{

	@Override
	public void getDietPlan() {
		System.out.println("Eat lots of proteins!");
		
	}

}
