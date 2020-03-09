package com.fdmgroup.tradingplatform.model;

import java.util.List;

public class Shareholder {

	private int shareholderID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String SSN;
	private double balance;
	private double investing;
	private List<Trade> trades;
	
	public Shareholder() {}
	
	public Shareholder(int shareholderID, String firstName, String lastName, String email, String password, String sSN,
			double balance, double investing, List<Trade> trades) {
		super();
		this.shareholderID = shareholderID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		SSN = sSN;
		this.balance = balance;
		this.investing = investing;
		this.trades = trades;
	}


	public int getShareholderID() {
		return shareholderID;
	}

	public void setShareholderID(int shareholderID) {
		this.shareholderID = shareholderID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInvesting() {
		return investing;
	}
	
	public void setInvesting(double investing) {
		this.investing = investing;
	}
	
	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	
	public Trade buyShare(int shares) {
		
	}
	
	public Trade sellShare(int shares) {
		
	}

	@Override
	public String toString() {
		return "Shareholder [shareholderID=" + shareholderID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", SSN=" + SSN + ", balance=" + balance + ", trades="
				+ trades + "]";
	}
	
	
	
}
