package com.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Personne;

@Repository
@Transactional
public class PersonneDaoImpl implements PersonneDao{

	@Autowired
	SessionFactory session;
	Session currentSession;
	
	private void getCurrentSession() {
		this.currentSession=session.getCurrentSession();
	}
	
	
	
	@Override
	public List<Personne> getListPersonne() {
		getCurrentSession();
		
		Query<Personne> theQuery= currentSession.createQuery("from Personne",Personne.class);
		
		
		return theQuery.getResultList();
	}

	@Override
	public Personne getPersonne(int iD) {
		getCurrentSession();
		return currentSession.get(Personne.class, iD);
	}

	@Override
	public void updatePersonne(Personne pers) {
		getCurrentSession();
		currentSession.update(pers);
	}

	@Override
	public void removePersonne(Personne pers) {
		getCurrentSession();
		currentSession.remove(pers);
	}

	@Override
	public void addPersonne(Personne pers) {
		getCurrentSession();
		currentSession.save(pers);
	}

	
}
