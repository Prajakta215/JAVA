package org.mphasis.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Orders {
	@Id
	private Integer ord_id;
	private Integer Cus_id;
	private Integer VEN_ID;
	private String wal_source;
	private Integer MEN_ID;
	private Date ord_date;
	private int ord_quantity;
	private double ord_billamount;
	private String ord_status;
	private String ord_comments;
	
	
	public Orders() {
		
	}


	public Orders(Integer ord_id, Integer cus_id, Integer vEN_ID, String wal_source, Integer mEN_ID, Date ord_date,
			int ord_quantity, double ord_billamount, String ord_status, String ord_comments) {
		super();
		this.ord_id = ord_id;
		this.Cus_id = cus_id;
		this.VEN_ID = vEN_ID;
		this.wal_source = wal_source;
		this.MEN_ID = mEN_ID;
		this.ord_date = ord_date;
		this.ord_quantity = ord_quantity;
		this.ord_billamount = ord_billamount;
		this.ord_status = ord_status;
		this.ord_comments = ord_comments;
	}


	public Integer getOrd_id() {
		return ord_id;
	}


	public void setOrd_id(Integer ord_id) {
		this.ord_id = ord_id;
	}


	public Integer getCus_id() {
		return Cus_id;
	}


	public void setCus_id(Integer cus_id) {
		Cus_id = cus_id;
	}


	public Integer getVEN_ID() {
		return VEN_ID;
	}


	public void setVEN_ID(Integer vEN_ID) {
		VEN_ID = vEN_ID;
	}


	public String getWal_source() {
		return wal_source;
	}


	public void setWal_source(String wal_source) {
		this.wal_source = wal_source;
	}


	public Integer getMEN_ID() {
		return MEN_ID;
	}


	public void setMEN_ID(Integer mEN_ID) {
		MEN_ID = mEN_ID;
	}


	public Date getOrd_date() {
		return ord_date;
	}


	public void setOrd_date(Date ord_date) {
		this.ord_date = ord_date;
	}


	public int getOrd_quantity() {
		return ord_quantity;
	}


	public void setOrd_quantity(int ord_quantity) {
		this.ord_quantity = ord_quantity;
	}


	public double getOrd_billamount() {
		return ord_billamount;
	}


	public void setOrd_billamount(double ord_billamount) {
		this.ord_billamount = ord_billamount;
	}


	public String getOrd_status() {
		return ord_status;
	}


	public void setOrd_status(String ord_status) {
		this.ord_status = ord_status;
	}


	public String getOrd_comments() {
		return ord_comments;
	}


	public void setOrd_comments(String ord_comments) {
		this.ord_comments = ord_comments;
	}
	
}