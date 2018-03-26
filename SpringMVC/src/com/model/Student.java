package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	String nom,prenom;
	Pays pays;
	static List<Student> listStudent = new ArrayList<>();
	final String[]langageProg= {"Python","Java","C++","C#"};
	String favProg;
	String favSysteme;
	final String []systemeExploitation= {"Mac","Windows","Linux"};
	final static Pays[]paysList= {Pays.SELECTION,Pays.FRA,Pays.ENG,Pays.CA};

	public Student() {
	}

	public Student(String nom, String prenom,Pays pays) {
		this.nom = nom;
		this.prenom = prenom;
		this.pays=pays;
		listStudent.add(this);
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
		return "Etudiant " + this.nom + " " + this.prenom+"\nNationalité " + this.pays+"\nProgrammation favorite "+this.favProg +" sur "+this.favSysteme;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Pays[] getPaysList() {
		return paysList;
	}


	public String[] getLangageProg() {
		return this.langageProg;
	}


	public String getFavProg() {
		return favProg;
	}

	public void setFavProg(String favProg) {
		this.favProg = favProg;
	}

	public String[] getSystemeExploitation() {
		return systemeExploitation;
	}

	public String getFavSysteme() {
		return favSysteme;
	}

	public void setFavSysteme(String favSysteme) {
		this.favSysteme = favSysteme;
	}



}
