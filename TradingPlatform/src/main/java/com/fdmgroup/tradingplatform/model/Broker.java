package com.fdmgroup.tradingplatform.model;

public class Broker implements User{
	
	private int brokerID;
	private String firstName;
	private String lastName;
	private Company company;

	public Broker() {}
	
	public Broker(int brokerID, String firstName, String lastName, Company company) {
		this.brokerID = brokerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company; 
	}

	public int getBrokerID() {
		return brokerID;
	}

	public void setBrokerID(int brokerID) {
		this.brokerID = brokerID;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Broker [brokerID=" + brokerID + ", firstName=" + firstName + ", lastName=" + lastName + ", company="
				+ company + "]";
	}

	@Override
	public Trade buyShare(int shares) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trade sellShare(int shares) {
		// TODO Auto-generated method stub
		return null;
	}
}
