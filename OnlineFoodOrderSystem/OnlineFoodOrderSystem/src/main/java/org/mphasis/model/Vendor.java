package org.mphasis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Vendor {
	@Id
	private Integer VEN_ID;
	private String VEN_NAME;
	private Integer VEN_PHONE;
	private String VEN_USERNAME;
	private String VEN_PASSWORD;
	private String VEN_EMAIL;

	public Vendor() {

	}

	public Vendor(Integer vEN_ID, String vEN_NAME, Integer vEN_PHONE, String vEN_USERNAME, String vEN_PASSWORD,
			String vEN_EMAIL) {
		super();
		this.VEN_ID = vEN_ID;
		this.VEN_NAME = vEN_NAME;
		this.VEN_PHONE = vEN_PHONE;
		this.VEN_USERNAME = vEN_USERNAME;
		this.VEN_PASSWORD = vEN_PASSWORD;
		this.VEN_EMAIL = vEN_EMAIL;
	}

	public Integer getVEN_ID() {
		return VEN_ID;
	}

	public void setVEN_ID(Integer vEN_ID) {
		VEN_ID = vEN_ID;
	}

	public String getVEN_NAME() {
		return VEN_NAME;
	}

	public void setVEN_NAME(String vEN_NAME) {
		VEN_NAME = vEN_NAME;
	}

	public Integer getVEN_PHONE() {
		return VEN_PHONE;
	}

	public void setVEN_PHONE(Integer vEN_PHONE) {
		VEN_PHONE = vEN_PHONE;
	}

	public String getVEN_USERNAME() {
		return VEN_USERNAME;
	}

	public void setVEN_USERNAME(String vEN_USERNAME) {
		VEN_USERNAME = vEN_USERNAME;
	}

	public String getVEN_PASSWORD() {
		return VEN_PASSWORD;
	}

	public void setVEN_PASSWORD(String vEN_PASSWORD) {
		VEN_PASSWORD = vEN_PASSWORD;
	}

	public String getVEN_EMAIL() {
		return VEN_EMAIL;
	}

	public void setVEN_EMAIL(String vEN_EMAIL) {
		VEN_EMAIL = vEN_EMAIL;
	}
	
	
}
