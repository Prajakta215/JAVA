package org.mphasis.controller;

import java.util.List;

import org.mphasis.model.Customer;
import org.mphasis.repository.CustomerDAO;
import org.mphasis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerDAO service;// jpa repo

//	@Autowired
//	CustomerRepository repo;
	@Autowired
	CustomerService cservice;

	@GetMapping("hey")
	public String welcome() {
		System.out.println("index.jsp");
		return "Hey,Welcome to our food website";

	}

//	@GetMapping("cust")
//	public List<Customer> getCustomers() {
//		return repo.getAll();
//	}

	@RequestMapping("/read-customer")
	public String showReadcUSTOMER(Model model) {
		model.addAttribute("contacts", cservice.findAll());
		return "readcustomer";
	}

	@RequestMapping("/add-customer")
	public String showAddBookPage(Model model) {
		model.addAttribute("customer", new Customer());
		return "createcustomer";
	}

	@RequestMapping(value = "/create-customer", method = RequestMethod.POST)
	public String createCustomer(@ModelAttribute("customer") Customer customer) {
		cservice.addCustomer(customer);
		return "redirect:/read-customer";
	}

	@GetMapping("jpaview")  //view
	public List<Customer> getCustomers() {
		return (List<Customer>) service.findAll();
	}

	@GetMapping("jpasingle/{cus_id}") 
	public String search(@PathVariable("cus_id") Integer cus_id) {
		return service.findById(cus_id).get().getCus_name();
	}

	@DeleteMapping("jpadelete/{cus_id}")    //delete
	public String delete(@PathVariable("cus_id") Integer cus_id) {
		service.deleteById(cus_id);
		return "Deleted";
	}

	@PostMapping("jpaadd")
	public String addcust(@RequestBody Customer customer) {
		service.save(customer);
		return "Inserted";
	}

	@PutMapping("jpaupdate/{cus_id}")
	public String update(@RequestBody Customer customer, @PathVariable("cus_id") Integer cus_id) {
		service.findById(cus_id).map(c -> {
			c.setCus_id(customer.getCus_id());
			c.setCus_name(customer.getCus_name());
			c.setCus_phn_no(customer.getCus_phn_no());
			c.setCus_username(customer.getCus_username());
			c.setCus_pass(customer.getCus_pass());
			c.setCus_email(customer.getCus_email());
			return service.save(c);
		});
		return "Updated";
	}

}
