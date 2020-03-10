package com.fdmgroup.tradingplatform.model;

public class Company {

	private int companyID;
	private String companyName;
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
