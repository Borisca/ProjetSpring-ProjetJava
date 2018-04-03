package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Personne implements Comparable<Personne> {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int iD;
	@Column(name = "first_name")
	String prenom;
	@Column(name = "last_name")
	String nom;
	@Column(name = "email")
	String courriel;

	public Personne() {
		super();
	}

	public Personne(int iD, String prenom, String nom, String courriel) {
		super();
		this.iD = iD;
		this.prenom = prenom;
		this.nom = nom;
		this.courriel = courriel;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courriel == null) ? 0 : courriel.hashCode());
		result = prime * result + iD;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (courriel == null) {
			if (other.courriel != null)
				return false;
		} else if (!courriel.equals(other.courriel))
			return false;
		if (iD != other.iD)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public int compareTo(Personne o) {
		int i = this.nom.compareTo(o.nom);
		if (i == 0) {
			i = this.prenom.compareTo(o.prenom);
		}
		System.out.println("COMPARE TO " + i);
		return i;
	}

	@Override
	public String toString() {
		return "Personne [iD=" + iD + ", prenom=" + prenom + ", nom=" + nom + ", courriel=" + courriel + "]";
	}
	

}
