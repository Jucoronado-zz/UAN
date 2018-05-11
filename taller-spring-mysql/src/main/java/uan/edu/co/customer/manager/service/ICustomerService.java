package uan.edu.co.customer.manager.service;

import uan.edu.co.customer.manager.model.OfertaInmobiliaria;

public interface ICustomerService {
	
	/**
	 * 
	 * @param customer
	 * @return
	 */
	public boolean save(OfertaInmobiliaria customer);
	
	
	/**
	 * 
	 * @param customerid
	 * @param customer
	 * @return
	 * @throws ResourceNotFoundException
	 */
	public boolean update(OfertaInmobiliaria customer);
	
	
	/**
	 * 
	 * @return
	 */
	public Iterable<OfertaInmobiliaria> retrieveCustomers();
	
	/**
	 * 
	 * @param lastName
	 * @return
	 */
	public Iterable<OfertaInmobiliaria> retrieveCustomersByLastName(String lastName);
	
	
}
