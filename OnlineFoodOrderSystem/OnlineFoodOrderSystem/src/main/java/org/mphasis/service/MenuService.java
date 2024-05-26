package org.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.mphasis.model.Menu;
import org.mphasis.repository.MenuDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

	@Autowired
	private MenuDAO mdao;

	public List<Menu> findAll() {
		return (List<Menu>) mdao.findAll();
	}

	public Optional<Menu> findById(int id) {
		return mdao.findById(id);
	}

	public Menu saveCustomer(Menu menu) {
		return mdao.save(menu);
	}

	public Menu updateMenu(int id, Menu menu) {
		Menu updated = mdao.findById(id).orElse(null);
		updated.setMEN_ID(menu.getMEN_ID());
		updated.setMEN_ITEM(menu.getMEN_ITEM());
		updated.setMEN_PRICE(menu.getMEN_PRICE());
		updated.setMEN_CALORIES(menu.getMEN_CALORIES());
		updated.setMEN_SPECIALITY(menu.getMEN_SPECIALITY());

		return mdao.save(updated);
	}

	public void deleteById(int id) {
		mdao.deleteById(id);
	}
}
