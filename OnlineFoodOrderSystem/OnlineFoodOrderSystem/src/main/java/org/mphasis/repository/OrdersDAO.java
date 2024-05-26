package org.mphasis.repository;

import org.mphasis.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersDAO extends CrudRepository<Orders, Integer>{

}
