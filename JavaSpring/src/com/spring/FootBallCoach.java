package com.spring;

public class FootBallCoach implements Coach, ICheeringService {

	ICheeringService cheeringService;
	int a;

	public FootBallCoach(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
	}
	public FootBallCoach(ICheeringService cheeringService,int a) {
		this.cheeringService = cheeringService;
		this.a=a;
	}

	@Override
	public String getDailyWorkOut() {
		return "Entrainement de foot";
	}

	@Override
	public String cheerUp() {

		return this.cheeringService.cheerUp()+a;
	}
	public ICheeringService getCheeringService() {
		return cheeringService;
	}
	public void setCheeringService(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	

}
