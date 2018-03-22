package com.spring;

public class BaseBallCoach implements Coach {

	ICheeringService cheeringService;
	static int a=0;
	
	public BaseBallCoach(ICheeringService cheeringService) {
		this.cheeringService=cheeringService;
		System.out.println("Constructeur BaseBallCoach");
		a++;
	}

	@Override
	public String getDailyWorkOut() {
		return "Entrainement de BaseBall"+" "+a+" "+this.hashCode();
	}

	@Override
	public String cheerUp() {
		return this.cheeringService.cheerUp();
	}
	
	public void doStart() {
		System.out.println("Bonjour BaseBallCoach");
	}
	public void doClose() {
		System.out.println("Aurevoir BaseBallCoach");
	}

	
}
