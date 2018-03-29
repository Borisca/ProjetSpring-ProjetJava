package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entity.Customer;


public interface CustomerDAO {

//	Customer getCustomer();
	public List<Customer> getCustomers();
}
