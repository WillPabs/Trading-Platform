package com.fdmgroup.tradingplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	
	@Id
	@Column(name="stock_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_id_gen")
	@SequenceGenerator(name = "stock_id_gen", sequenceName = "stock_id_gen", allocationSize = 1)
	private int stockID;
	private String ticker;
	private double price;
	
	public Stock() {}
	
	public Stock(int stockID, String ticker, double price) {
		super();
		this.stockID = stockID;
		this.ticker = ticker;
		this.price = price;
	}

	public int getStockID() {
		return stockID;
	}

	public void setStockID(int stockID) {
		this.stockID = stockID;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", ticker=" + ticker + ", price=" + price + "]";
	}


}
