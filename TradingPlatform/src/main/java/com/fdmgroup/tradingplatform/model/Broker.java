package com.fdmgroup.tradingplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "broker")
public class Broker extends User{
	
	@Id
	@Column(name="broker_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "broker_id_gen")
	@SequenceGenerator(name = "broker_id_gen", sequenceName = "broker_id_gen", allocationSize = 1)
	private int brokerID;
	
	@Column(name="first_name", nullable=false, length=35)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=35)
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name="fk_company_id")
	private Company company;

	public Broker() {
		super();
	}
	
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
	Trade buyShares(int shares) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	Trade sellShares(int shares) {
		return null;
		// TODO Auto-generated method stub
		
	}
}
