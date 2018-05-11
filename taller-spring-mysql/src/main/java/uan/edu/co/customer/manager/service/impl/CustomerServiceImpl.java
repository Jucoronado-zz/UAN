package uan.edu.co.customer.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.edu.co.customer.manager.model.OfertaInmobiliaria;
import uan.edu.co.customer.manager.model.CustomerRepository;
import uan.edu.co.customer.manager.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	
	@Autowired
	CustomerRepository repository;

	@Override
	public boolean save(OfertaInmobiliaria customer) {
		repository.save(customer);
		return true;
	}

	@Override
	public Iterable<OfertaInmobiliaria> retrieveCustomers() {
		return repository.findAll();
	}

	@Override
	public Iterable<OfertaInmobiliaria> retrieveCustomersByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

	@Override
	public boolean update(OfertaInmobiliaria customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
