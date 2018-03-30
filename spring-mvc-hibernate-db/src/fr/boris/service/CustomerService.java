package fr.boris.service;

import java.util.List;

import fr.benoit.db.entity.Customer;

public  interface CustomerService {
	public void addCustomer(Customer cust);
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void removeCustomer(Customer cust);
}
