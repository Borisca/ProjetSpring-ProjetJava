package com.model;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 * @author bden
 *
 */
public enum Pays {
	
	
	
	SELECTION ("null","Selectionnez votre pays"),FRA("France","FRA"),ENG("Angleterre","ENG"),CA("Canada","CA");
	
	final String nom,abreg;


	
	
	private Pays(String nom, String abreg) {
		this.nom = nom;
		this.abreg = abreg;
	}




	public String getNom() {
		return nom;
	}




	public String getAbreg() {
		return abreg;
	}	
	
	public String toString() {
		
		return this.nom;
	}
	
}
