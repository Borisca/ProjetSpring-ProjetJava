package com.spring;

public class BaseBallCoach implements Coach {

	ICheeringService cheeringService;
	
	
	public BaseBallCoach(ICheeringService cheeringService) {
		this.cheeringService=cheeringService;
	}

	@Override
	public String getDailyWorkOut() {

		return "Entrainement de BaseBall";
	}

	@Override
	public String cheerUp() {
		return this.cheeringService.cheerUp();
	}

	
}
