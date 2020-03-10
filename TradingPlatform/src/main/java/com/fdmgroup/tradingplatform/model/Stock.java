package com.fdmgroup.tradingplatform.model;

public class Stock {
	
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
