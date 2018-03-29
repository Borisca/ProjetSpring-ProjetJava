package com.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.City;
@Repository
public class CityDAOImpl implements CityDAO {

	@Autowired(required=true)
	SessionFactory session;

	@Override
	@Transactional
	public List<City> getCities() {

		Session currentSession = session.getCurrentSession();

		Query<City> query = currentSession.createQuery("from City",City.class);
		
		List<City> a = query.getResultList();

		for (City city : a) {
			System.out.println(city);
		}
		return a;
	}

	public SessionFactory getSession() {
		return session;
	}

	public void setSession(SessionFactory session) {
		this.session = session;
	}
	

}
