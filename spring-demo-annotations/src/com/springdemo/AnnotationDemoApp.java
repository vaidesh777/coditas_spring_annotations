package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Coach;
import com.spring.demo.coach;

public class AnnotationDemoApp {
	
	
	public static void main(String args[])
	{
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
        
		Coach theCoach=context.getBean("thatSillyCoach",coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
