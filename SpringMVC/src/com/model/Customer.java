package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.websocket.OnError;

import org.springframework.format.annotation.NumberFormat;

/**
 * @author bden
 *
 */
public class Customer {


	@NotEmpty(message="is required") 
	String nom;
	String prenom;
	@NotNull @Min(value=0,message="au moins 1 an") @Max(value=99,message="Pas au dessus de 99")
	int age;
	
	public Customer(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Customer() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Customer [nom=" + nom + ", prenom=" + prenom + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
