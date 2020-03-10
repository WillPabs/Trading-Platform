package com.fdmgroup.tradingplatform.model;

public class SystemAdmin {
	
	private int adminID;
	private String firstName;
	private String lastName;
	
	public SystemAdmin() {}
	
	public SystemAdmin(int adminID, String firstName, String lastName) {
		super();
		this.adminID = adminID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
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
	@Override
	public String toString() {
		return "SystemAdmin [adminID=" + adminID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
