package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footCoach=context.getBean("FootBallCoach",Coach.class);
		Coach footCoach2=context.getBean("FootBallCoach",Coach.class);	
		System.out.println(footCoach.getDailyWorkOut());
		System.out.println(footCoach2.getDailyWorkOut());
		Coach baseBallCoach=context.getBean("BaseBallCoach",Coach.class);
		Coach baseBallCoach2=context.getBean("BaseBallCoach",Coach.class);
		Coach cricketCoach=context.getBean("CricketCoach",Coach.class);
		Coach cricketCoach2=context.getBean("CricketCoach",Coach.class);
		Coach piscineCoach =context.getBean("PiscineCoach",Coach.class);

		System.out.println(baseBallCoach.getDailyWorkOut());
		System.out.println(baseBallCoach2.getDailyWorkOut());
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach2.getDailyWorkOut());
		System.out.println(footCoach.cheerUp());
		System.out.println(baseBallCoach.cheerUp());
		System.out.println(cricketCoach.cheerUp());
		System.out.println(piscineCoach.cheerUp());
		System.out.println(piscineCoach.cheerUp());
		System.out.println(piscineCoach.cheerUp());
		System.out.println(piscineCoach.cheerUp());
		context.close();
	}
}
