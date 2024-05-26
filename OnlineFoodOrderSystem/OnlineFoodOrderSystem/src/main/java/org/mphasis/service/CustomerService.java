package org.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.mphasis.model.Customer;
import org.mphasis.repository.CustomerDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Configuration
@Service
public class CustomerService {
//	List<Customer> list;
//	
//	public CustomerService() {
//		list = new ArrayList<Customer>();
//		Customer c1 = new Customer(1, "Pooja", 88888888, "Pooja23", "Pooja!12", "poojaK@gmail.com");
//		list.add(c1);
//		Customer c2 = new Customer(3, "Priya", 785156687, "PriyaK", "Priya!12", "priya@gmail.com");
//		list.add(c2);
//	}
//
//	public List<Customer> getAll() {
//		
//		return list;
//	}

	@Autowired
	private CustomerDAO cdao;

	public List<Customer> findAll() {
		return (List<Customer>) cdao.findAll();
	}

	public Optional<Customer> findById(int id) {
		return cdao.findById(id);
	}

	public Customer addCustomer(Customer customer) {
		return cdao.save(customer);
	}

	public Customer updateContact(int id, Customer customer) {
		Customer updated = cdao.findById(id).orElse(null);
		updated.setCus_id(customer.getCus_id());
		updated.setCus_name(customer.getCus_name());
		updated.setCus_phn_no(customer.getCus_phn_no());
		updated.setCus_username(customer.getCus_username());
		updated.setCus_pass(customer.getCus_pass());
		updated.setCus_email(customer.getCus_email());
		return cdao.save(updated);
	}

	public void deleteById(int id) {
		cdao.deleteById(id);
	}

}
