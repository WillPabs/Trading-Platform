package com.fdmgroup.tradingplatform.model;

public class Trade {
	
	private int tradeID;
	private Shareholder shareholder;
	private Broker broker;
	private Stock stock; 
	private String time;
	private String date;
	private double price;
	private int quantity;
	
	public Trade() {}
	
	public Trade(int tradeID, Shareholder shareholder, Broker broker, Stock stock, String time, String date,
			double price, int quantity) {
		super();
		this.tradeID = tradeID;
		this.shareholder = shareholder;
		this.broker = broker;
		this.stock = stock;
		this.time = time;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
	}

	public int getTradeID() {
		return tradeID;
	}

	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	public Shareholder getShareholder() {
		return shareholder;
	}

	public void setShareholder(Shareholder shareholder) {
		this.shareholder = shareholder;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Trade [tradeID=" + tradeID + ", shareholder=" + shareholder + ", broker=" + broker + ", stock=" + stock
				+ ", time=" + time + ", date=" + date + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
