package com.vasanth.springworkshop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vasanth.springworkshop.coach.Coach;
import com.vasanth.springworkshop.configuration.JavaSpringConfiguration;

public class SpringDemoMainApp {

	public static void main(String[] args) {
		
		
//		ClassPathXmlApplicationContext context=
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(JavaSpringConfiguration.class);
		
		
		Coach coach= context.getBean("volleyBallCoach",Coach.class);
		
		coach.getWorkout();
		
//		coach.getDietPlan();
		
		context.close();

	}

}
