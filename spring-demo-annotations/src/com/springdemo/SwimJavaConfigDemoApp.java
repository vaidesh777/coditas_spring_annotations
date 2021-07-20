package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Coach;
import com.spring.demo.coach;

public class SwimJavaConfigDemoApp {

	public static void main(String args[]) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoah", coach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
