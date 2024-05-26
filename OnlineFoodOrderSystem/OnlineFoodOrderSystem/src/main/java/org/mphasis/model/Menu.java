package org.mphasis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Menu {
	@Id
	private Integer MEN_ID;
	private String MEN_ITEM;
	private double MEN_PRICE;
	private double MEN_CALORIES;
	private String MEN_SPECIALITY;

	public Menu() {
		
	}
	
	public Menu(Integer mEN_ID, String mEN_ITEM, double mEN_PRICE, double mEN_CALORIES, String mEN_SPECIALITY) {
		super();
		this.MEN_ID = mEN_ID;
		this.MEN_ITEM = mEN_ITEM;
		this.MEN_PRICE = mEN_PRICE;
		this.MEN_CALORIES = mEN_CALORIES;
		this.MEN_SPECIALITY = mEN_SPECIALITY;
	}

	public Integer getMEN_ID() {
		return MEN_ID;
	}

	public void setMEN_ID(Integer mEN_ID) {
		MEN_ID = mEN_ID;
	}

	public String getMEN_ITEM() {
		return MEN_ITEM;
	}

	public void setMEN_ITEM(String mEN_ITEM) {
		MEN_ITEM = mEN_ITEM;
	}

	public double getMEN_PRICE() {
		return MEN_PRICE;
	}

	public void setMEN_PRICE(double mEN_PRICE) {
		MEN_PRICE = mEN_PRICE;
	}

	public double getMEN_CALORIES() {
		return MEN_CALORIES;
	}

	public void setMEN_CALORIES(double mEN_CALORIES) {
		MEN_CALORIES = mEN_CALORIES;
	}

	public String getMEN_SPECIALITY() {
		return MEN_SPECIALITY;
	}

	public void setMEN_SPECIALITY(String mEN_SPECIALITY) {
		MEN_SPECIALITY = mEN_SPECIALITY;
	}

}