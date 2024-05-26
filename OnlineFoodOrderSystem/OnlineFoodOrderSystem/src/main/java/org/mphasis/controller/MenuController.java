package org.mphasis.controller;

import java.util.List;

import org.mphasis.model.Menu;
import org.mphasis.repository.MenuDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	@Autowired
	private MenuDAO menuservice;

	@GetMapping("/")
	public String hello() {
		return "hello";
	}

	@GetMapping("menuview")
	public List<Menu> getMenus() {
		return (List<Menu>) menuservice.findAll();
	}

	@GetMapping("menusingle/{men_id}")
	public String search(@PathVariable("men_id") Integer men_id) {
		return menuservice.findById(men_id).get().getMEN_ITEM();
	}

	@DeleteMapping("menudelete/{men_id}")
	public String delete(@PathVariable("MEN_ID") Integer men_id) {
		menuservice.deleteById(men_id);
		return "Deleted";
	}

	@PostMapping("menuadd")
	public String addmenu(@RequestBody Menu menu) {
		menuservice.save(menu);
		return "Inserted";
	}

}