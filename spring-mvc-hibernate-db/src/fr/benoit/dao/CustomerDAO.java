package fr.benoit.dao;

import java.util.List;

import fr.benoit.db.entity.Customer;

public interface CustomerDAO {

	// Read.
	public List<Customer> getCustomers();
	public void addCustomer(Customer cust);
	public Customer getCustomer(int id); 
	public void removeCustomer(Customer cust);
}
