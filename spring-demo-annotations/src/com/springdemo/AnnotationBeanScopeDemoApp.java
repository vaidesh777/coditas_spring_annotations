package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AnnotationBeanScopeDemoApp {
	public static void main(String args[])

	{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml)");
	
	Coach thecoach = context.getBean("tennisCoach", Coach.class);
	Coach alphacoach = context.getBean("tennisCoach", Coach.class);
	
	System.out.println("\nppointing to the same object"+result);
	
	System.out.println("\nmemory location for theCoach"+theCoach);
	System.out.println("\nmemory loction for alphacoach"+alphaCoach);
	context.close();
	

	

}
