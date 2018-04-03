package com.DAO;

import java.util.List;

import com.entity.Personne;

public interface PersonneDao {

	public List<Personne> getListPersonne();
	public Personne getPersonne(int iD);
	public void updatePersonne(Personne pers);
	public void removePersonne(Personne pers);
	public void addPersonne(Personne pers);
	
	
}
