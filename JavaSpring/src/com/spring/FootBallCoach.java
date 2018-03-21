package com.spring;

public class FootBallCoach implements Coach, ICheeringService {

	ICheeringService cheeringService;

	public FootBallCoach(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Entrainement de foot";
	}

	@Override
	public String cheerUp() {

		return this.cheeringService.cheerUp();
	}

}
