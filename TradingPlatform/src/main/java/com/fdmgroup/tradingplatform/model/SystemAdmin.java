package com.fdmgroup.tradingplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "system_admin")
public class SystemAdmin {
	
	@Id
	@Column(name="admin_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_id_gen")
	@SequenceGenerator(name = "admin_id_gen", sequenceName = "admin_id_gen", allocationSize = 1)
	private int adminID;
	
	@Column(name="first_name", nullable=false, length=35)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=35)
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
