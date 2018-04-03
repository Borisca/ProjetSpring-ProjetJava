package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.PersonneDao;
import com.entity.Personne;

@Service
public class ServiceDaoImpl implements ServiceDao{

	@Autowired
	PersonneDao persDao;
	
	@Override
	public List<Personne> getListPersonne() {
		return persDao.getListPersonne();
	}

	@Override
	public Personne getPersonne(int iD) {
		return persDao.getPersonne(iD);
	}

	@Override
	public void updatePersonne(Personne pers) {
		persDao.updatePersonne(pers);
		
	}

	@Override
	public void removePersonne(Personne pers) {
		persDao.removePersonne(pers);
		
	}

	@Override
	public void addPersonne(Personne pers) {
		persDao.addPersonne(pers);
		
	}

}
