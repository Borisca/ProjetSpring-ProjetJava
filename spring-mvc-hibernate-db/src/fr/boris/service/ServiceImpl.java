package fr.boris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benoit.dao.CustomerDAO;
import fr.benoit.db.entity.Customer;

@Service
@Transactional
public class ServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO cdi;

	public List<Customer> getCustomers() {
		return cdi.getCustomers();
	}
	
	public void addCustomer(Customer cust) {
		cdi.addCustomer(cust);
	}

	@Override
	public Customer getCustomer(int id) {
		
		return cdi.getCustomer(id);
	}

	
	
}
