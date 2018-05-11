package uan.edu.co.customer.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uan.edu.co.customer.manager.model.OfertaInmobiliaria;
import uan.edu.co.customer.manager.service.ICustomerService;



@RestController
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	
	@PutMapping("/save")
	public ResponseEntity<Boolean> process( @RequestBody OfertaInmobiliaria customer ){
		return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<Iterable<OfertaInmobiliaria>>  findAll(){
		return new ResponseEntity<>(customerService.retrieveCustomers(), HttpStatus.OK);
	}
	
	@GetMapping("/findByLastName")
	public ResponseEntity<Iterable<OfertaInmobiliaria>>  findByLastName(@RequestParam String lastName){
		return new ResponseEntity<>(customerService.retrieveCustomersByLastName(lastName), HttpStatus.OK);
	}
	
	/**@Override
	public Customer update(Customer customer) throws ResourceNotFoundException{
		Optional<Customer> found= repository.findById(Customer.getIdnueble());
		if(!found.IsPresent())
		{
		throws new ResourceNotFoundException("Customer","idmueble",customer.getIdmueble());
		}
		else(
				return repository.save(customer);
				)
		
	}
	
			
			@GetMapping("/notes")
			public List<Note> getAllNotes() {
			    return noteRepository.findAll();
			}
		
			@DeleteMapping("/notes/{id}")
			public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
			    Note note = noteRepository.findById(noteId)
			            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

			    noteRepository.delete(note);

			    return ResponseEntity.ok().build();
			}*/
	
}

