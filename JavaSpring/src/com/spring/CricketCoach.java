package com.spring;

public class CricketCoach implements Coach {
	
	
	ICheeringService cheeringService;

	public CricketCoach(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
	}

	@Override
	public String getDailyWorkOut() {

		return "Entrainement de Cricket";
	}

	@Override
	public String cheerUp() {
		// TODO Auto-generated method stub
		return this.cheeringService.cheerUp();
	}

}
