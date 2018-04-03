package com.service;

import java.util.List;

import com.entity.Personne;

public interface ServiceDao {


	public List<Personne> getListPersonne();
	public Personne getPersonne(int iD);
	public void updatePersonne(Personne pers);
	public void removePersonne(Personne pers);
	public void addPersonne(Personne pers);
}
