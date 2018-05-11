package uan.edu.co.customer.manager.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<OfertaInmobiliaria, Long>{
	List<OfertaInmobiliaria> findByLastName(String lastName);
}
