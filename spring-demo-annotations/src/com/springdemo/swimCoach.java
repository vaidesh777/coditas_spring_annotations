package com.springdemo;

public class swimCoach implements Coach {

	private FortuneService fortuneService;
	public swimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "swim 1000 meters a warm up";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
