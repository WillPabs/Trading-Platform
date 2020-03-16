package com.fdmgroup.tradingplatform.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "trade")
public class Trade {
	
	@Id
	@Column(name="trade_id", nullable=false, length=4, unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trade_id_gen")
	@SequenceGenerator(name = "trade_id_gen", sequenceName = "trade_id_gen", allocationSize = 1)
	private int tradeID;
	
	@ManyToOne
	@JoinColumn(name="fk_shareholder_id")
	private Shareholder shareholder;
	
	@ManyToOne
	@JoinColumn(name="fk_broker_id")
	private Broker broker;
	
	@OneToOne
	@JoinColumn(name="fk_stock_id")
	private Stock stock; 
	
	@Column(name="transaction_time")
	private Date transactionTime;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="quantity")
	private int quantity;
	
	public Trade() {}
	
	public Trade(int tradeID, Shareholder shareholder, Broker broker, Stock stock, Date time,
			BigDecimal price, int quantity) {
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

	public Date getTime() {
		return transactionTime;
	}

	public void setTime(Date time) {
		this.transactionTime = time;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
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
