package org.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.mphasis.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
	@Autowired
	private OrdersService oserService;

	public List<Orders> findAll() {
		return (List<Orders>) oserService.findAll();
	}

	public Optional<Orders> findById(int id) {
		return oserService.findById(id);
	}

	public void deleteById(int id) {
		oserService.deleteById(id);
	}
}
