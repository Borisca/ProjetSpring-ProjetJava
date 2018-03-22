package com.spring;

public class FootBallCoach implements Coach, ICheeringService {

	ICheeringService cheeringService;
	int a;
	static int b;

	public FootBallCoach(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
		System.out.println("Constructeur FootballCoach");
		b++;
	}
	public FootBallCoach(ICheeringService cheeringService,int a) {
		this.cheeringService = cheeringService;
		this.a=a;
	}

	@Override
	public String getDailyWorkOut() {
		return "Entrainement de foot"+" "+b+" "+this.hashCode();
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
	public void doStart() {
		System.out.println("Bonjour FootBallCoach");
	}
	public void doClose() {
		System.out.println("Aurevoir FootBallCoach");
	}

}
