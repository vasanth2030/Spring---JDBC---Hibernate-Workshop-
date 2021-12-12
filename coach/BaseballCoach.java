package com.vasanth.springworkshop.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vasanth.springworkshop.diet.Diet;

@Component("coach")
public class BaseballCoach implements Coach {

	@Autowired
	@Qualifier("weightGainDiet")
	private Diet diet;
	
//	BaseballCoach(Diet diet)
//	{
//		this.diet=diet;
//	}
	
	
//	public void setDiet(Diet diet)
//	{
//		this.diet=diet;
//	}
	
	@Override
	public void getWorkout() {
		System.out.println("Sprint for 30 minutes straight.");

	}

	@Override
	public void getDietPlan() {
		
		diet.getDietPlan();
		

	}
	
	
	// name -> setName 

}
