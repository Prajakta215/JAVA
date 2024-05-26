package org.mphasis.repository;

import org.mphasis.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
