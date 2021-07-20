package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
class SportConfig {

	@Bean
	public FortuneService SadFortuneService() {
		return new SadFortuneService();

	}

	@Bean
	public Coach swimCoach() {
		return new swimCoach(SadFortuneService());

	}

}
