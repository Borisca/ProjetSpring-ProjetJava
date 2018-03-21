package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footCoach=context.getBean("FootBallCoach",Coach.class);
		Coach baseBallCoach=context.getBean("BaseBallCoach",Coach.class);
		Coach cricketCoach=context.getBean("CricketCoach",Coach.class);
		System.out.println(footCoach.getDailyWorkOut());
		System.out.println(baseBallCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(footCoach.cheerUp());
		System.out.println(baseBallCoach.cheerUp());
		System.out.println(cricketCoach.cheerUp());
		context.close();
	}
}
