package com.fdmgroup.tradingplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name="company_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_id_gen")
	@SequenceGenerator(name = "company_id_gen", sequenceName = "company_id_gen", allocationSize = 1)
	private int companyID;
	
	@Column(name="company_name")
	private String companyName;
	
	@OneToOne
	@JoinColumn(name="fk_stock_id")
	private Stock stock;
	
	public Company() {}
	
	public Company(int companyID, String companyName, Stock stock) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.stock = stock;
	}
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", companyName=" + companyName + ", stock=" + stock + "]";
	}
	
	
}
