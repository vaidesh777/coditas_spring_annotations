package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Scope("protoype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("HappyFortuneService")
	private FortuneService fortuneService;

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService=theFortuneService; }
	 */

	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	/*@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("tenniscoach: inside doSomeCrazystuff");
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();

	}

}
