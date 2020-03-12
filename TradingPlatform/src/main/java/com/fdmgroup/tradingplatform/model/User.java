package com.fdmgroup.tradingplatform.model;

public abstract class User {

	private int userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	
	public User() {
		super();
	}
	
	public User(int userID, String firstName, String lastName, String email, String password, String confirmPassword) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	

	abstract Trade buyShares(int shares);
	abstract Trade sellShares(int shares);
	
}
