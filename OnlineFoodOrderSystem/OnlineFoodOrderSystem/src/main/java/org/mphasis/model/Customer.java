package org.mphasis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity

public class Customer {
	@Id

	private Integer cus_id;

	private String cus_name;

	private Integer cus_phn_no;

	private String cus_username;

	private String cus_pass;

	private String cus_email;

	public Customer() {

	}

	public Customer(Integer cus_id, String cus_name, Integer cus_phn_no, String cus_username, String cus_pass,
			String cus_email) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_phn_no = cus_phn_no;
		this.cus_username = cus_username;
		this.cus_pass = cus_pass;
		this.cus_email = cus_email;
	}

	public Integer getCus_id() {
		return cus_id;
	}

	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public Integer getCus_phn_no() {
		return cus_phn_no;
	}

	public void setCus_phn_no(Integer cus_phn_no) {
		this.cus_phn_no = cus_phn_no;
	}

	public String getCus_username() {
		return cus_username;
	}

	public void setCus_username(String cus_username) {
		this.cus_username = cus_username;
	}

	public String getCus_pass() {
		return cus_pass;
	}

	public void setCus_pass(String cus_pass) {
		this.cus_pass = cus_pass;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public void addAttribute(String string, List<Customer> findAll) {
		

	}

}
