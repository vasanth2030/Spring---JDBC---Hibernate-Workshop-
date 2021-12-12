package com.vasanth.springworkshop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vasanth.springworkshop.coach.VolleyballCoach;

@Configuration
@ComponentScan("com.vasanth.springworkshop")
public class JavaSpringConfiguration {
	
//	@Bean
//	public VolleyballCoach volleyBallCoach()
//	{
//		return new VolleyballCoach();
//	}

}
