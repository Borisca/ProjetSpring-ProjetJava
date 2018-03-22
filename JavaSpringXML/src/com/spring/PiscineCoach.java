package com.spring;

public class PiscineCoach implements Coach{
	
	private String email;
	private String nomEquipe;
	private ICheeringService cheeringService;
	
	
	public PiscineCoach() {
		System.out.println("Constructeur PiscineCoach");
	}

	public PiscineCoach(ICheeringService cheeringService) {
		
		this.cheeringService = cheeringService;
	}

	public PiscineCoach(String email, String nomEquipe) {
		this.email = email;
		this.nomEquipe = nomEquipe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String adresseEMail) {
		this.email = adresseEMail;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Alllez LAAAAA";
	}

	@Override
	public String cheerUp() {
		// TODO Auto-generated method stub
		return this.cheeringService.cheerUp();
	}

	public ICheeringService getCheeringService() {
		System.out.println("Getter");
		return cheeringService;
	}

	public void setCheeringService(ICheeringService cheeringService) {
		System.out.println("Setter");
		this.cheeringService = cheeringService;
	}
	

	public void doStart() {
		System.out.println("Bonjour PiscineCoach");
	}
	public void doClose() {
		System.out.println("Aurevoir PiscineCoach");
	}
}
