package org.mphasis.controller;

import java.util.List;
import org.mphasis.model.Orders;
import org.mphasis.repository.OrdersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	@Autowired
	OrdersDAO odao;

	@GetMapping("orderview")
	public List<Orders> getOrders() {
		return (List<Orders>) odao.findAll();
	}
	@GetMapping("orderserach/{ord_id}")
	public Integer search(@PathVariable("ord_id") Integer ord_id) {
		return odao.findById(ord_id).get().getOrd_id();
	}
	
	@PostMapping("ordersadd")
	public String addorders(@RequestBody Orders orders) {
		odao.save(orders);
		return "Inserted";
		
	}
}
