package org.mphasis.controller;

import java.util.List;

import org.mphasis.model.Customer;
import org.mphasis.model.Wallet;
import org.mphasis.repository.WalletDAO;
import org.mphasis.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WalletController {
	@Autowired
	WalletDAO wdao;
	
	@Autowired
	WalletService wService;
	
	@GetMapping("hey")
	public String welcome() {
		System.out.println("index.jsp");
		return "Hey,Welcome to our food website";

	}
	@GetMapping("jpaview")  //view
	public List<Wallet> getWallets() {
		return (List<Wallet>) wService.findAll();
	}

	@GetMapping("jpasingle/{Wal_id}") 
	public double search(@PathVariable("Wal_id") Integer Wal_id) {
		return wService.findById(Wal_id).get().getWal_amount();
	}

	@DeleteMapping("jpadelete/{Wal_id}")    //delete
	public String delete(@PathVariable("Wal_id") Integer Wal_id) {
		wService.deleteById(Wal_id);
		return "Deleted";
	}

	@PostMapping("jpaadd")
	public String addcust(@RequestBody Wallet wallet) {
		wService.save(wallet);
		return "Inserted";
	}
}
