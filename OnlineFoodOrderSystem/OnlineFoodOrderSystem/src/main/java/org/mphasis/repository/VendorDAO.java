package org.mphasis.repository;


import org.mphasis.model.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VendorDAO extends CrudRepository<Vendor, Integer>{

}
