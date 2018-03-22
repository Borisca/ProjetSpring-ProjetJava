package com.spring;

public class RandomCheering implements ICheeringService{

	String[]  reaction= new String [10];
	int rand;
	
	
	public RandomCheering() {
		reaction[0]="Bien joue";
		reaction[1]="Mouai";
		reaction[2]="T'es Mauvais";
		reaction[3]="T'es viré";
		reaction[4]="T'es le meilleur";
		reaction[5]="Peu mieux faire";
		reaction[6]="Tu te fous de ma gueule";
		reaction[7]="Jtemmerde";
		reaction[8]="Enculé";
		reaction[9]="Viens te battre";
	}



	@Override
	public String cheerUp() {
		rand=0 + (int)(Math.random() * ((9 - 0) + 1));
		return reaction[rand];
	}

}
