package com.spring;

public class CricketCoach implements Coach {
	
	static int a;
	ICheeringService cheeringService;

	public CricketCoach(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
		System.out.println("Constructeur CricketCoach");
		a++;
	}

	@Override
	public String getDailyWorkOut() {

		return "Entrainement de Cricket"+" "+a+" "+this.hashCode();
	}

	@Override
	public String cheerUp() {
		// TODO Auto-generated method stub
		return this.cheeringService.cheerUp();
	}

	public void doStart() {
		System.out.println("Bonjour CricketCoach");
	}
	public void doClose() {
		System.out.println("Aurevoir CricketCoach");
	}
}
