package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.annotation.exemplevalidation.Promotion;

/**
 * @author bden
 *
 */
public class Customer {


	@Promotion(value= {"BOR","BEN"})
	private String promoCode;
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Yo code postal faux")
	private String postalCode;
	@NotEmpty(message="is required") 
	private String nom;
	private String prenom;
	@NotNull(message="Erreur") 	@Min(value=0,message="au moins 1 an") @Max(value=99,message="Pas au dessus de 99")
	private int age;
	
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
		return "Customer nom :" + nom + ", prenom:" + prenom + " "+age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	
}
