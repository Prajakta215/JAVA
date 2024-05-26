package org.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.mphasis.model.Menu;
import org.mphasis.model.Vendor;
import org.mphasis.repository.MenuDAO;
import org.mphasis.repository.VendorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

	@Autowired
	private VendorDAO vdao;

	public List<Vendor> findAll() {
		return (List<Vendor>) vdao.findAll();
	}

	public Optional<Vendor> findById(int id) {
		return vdao.findById(id);
	}

	public Vendor addVendor(Vendor vendor) {
		return vdao.save(vendor);
	}

//	public Menu updateMenu(int id, Menu menu) {
//		Menu updated = vdao.findById(id).orElse(null);
//		updated.setMEN_ID(menu.getMEN_ID());
//		updated.setMEN_ITEM(menu.getMEN_ITEM());
//		updated.setMEN_PRICE(menu.getMEN_PRICE());
//		updated.setMEN_CALORIES(menu.getMEN_CALORIES());
//		updated.setMEN_SPECIALITY(menu.getMEN_SPECIALITY());
//
//		return mdao.save(updated);
//	}

	public void deleteById(int id) {
		vdao.deleteById(id);
	}
}
