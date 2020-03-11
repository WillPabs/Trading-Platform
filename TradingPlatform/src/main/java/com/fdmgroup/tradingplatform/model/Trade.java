package com.fdmgroup.tradingplatform.model;

public class Trade {
	
	private int tradeID;
	private Shareholder shareholder;
	private Broker broker;
	private Stock stock; 
	private String transactionTime;
	private double price;
	private int quantity;
	
	public Trade() {}
	
	public Trade(int tradeID, Shareholder shareholder, Broker broker, Stock stock, String time,
			double price, int quantity) {
		super();
		this.tradeID = tradeID;
		this.shareholder = shareholder;
		this.broker = broker;
		this.stock = stock;
		this.transactionTime = time;		
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
		return transactionTime;
	}

	public void setTime(String time) {
		this.transactionTime = time;
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
				+ ", time=" + transactionTime + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
