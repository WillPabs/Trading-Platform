package com.fdmgroup.tradingplatform.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "shareholder")
public class Shareholder extends User{

	@Id
	@Column(name="shareholder_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shareholder_id_gen")
	@SequenceGenerator(name = "shareholder_id_gen", sequenceName = "shareholder_id_gen", allocationSize = 1)
	private int shareholderID;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="sh_password")
	private String password;
	
	@Column(name="sh_confirm_password")
	private String confirmPassword;
	
	@Column(name="ssn")
	private String SSN;
	
	@Column(name="balance")
	private BigDecimal balance;
	
	@Column(name="investing")
	private BigDecimal investing;
	
	@Transient
	private List<Trade> trades;
	
	public Shareholder() {}
	
	public Shareholder(int shareholderID, String firstName, String lastName, String email, String password, String sSN,
			BigDecimal balance, BigDecimal investing, List<Trade> trades) {
		super();
		this.shareholderID = shareholderID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.SSN = sSN;
		this.balance = balance;
		this.investing = investing;
		this.trades = trades;
	}
	
	public Shareholder(String firstName, String lastName, String email, String password, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.SSN = ssn;
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
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getInvesting() {
		return investing;
	}
	
	public void setInvesting(BigDecimal investing) {
		this.investing = investing;
	}
	
	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	
	@Override
	Trade buyShares(int shares) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	Trade sellShares(int shares) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Shareholder [shareholderID=" + shareholderID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", SSN=" + SSN + ", balance=" + balance + ", trades="
				+ trades + "]";
	}

	
	
}
