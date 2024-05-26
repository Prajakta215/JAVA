package org.mphasis.controller;

import java.util.List;

import org.mphasis.model.Vendor;
import org.mphasis.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VendorController {

	@Autowired
	private VendorService vService;
	
	@GetMapping("vendorview")
	public List<Vendor> getVendors() {
		return (List<Vendor>) vService.findAll();
	}

	
}
