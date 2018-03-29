package fr.benoit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.SynchronossPartHttpMessageReader;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.benoit.db.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// Need to inject the session factory.
	@Autowired
	private SessionFactory sessionFactory;

	@Override

	public List<Customer> getCustomers() {

		// Get the current hibernate session.
		Session currentSession = sessionFactory.getCurrentSession();

		/*
		 * Create a query ... sort by last name. from Customer : c'est la classe
		 * Customer.
		 */
		
		Query<Customer> q = currentSession.createQuery("from Customer", Customer.class);

		// Execute query and get result list.
		List<Customer> customers = q.getResultList();

		for (Customer customer : customers) {
			System.out.println(customer);
		}

		// Test
		// System.out.println("ici "+ customers.toString());

		return customers;

	}

}
