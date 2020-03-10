package com.fdmgroup.tradingplatform.model;

public interface User {
	
	Trade buyShare(int shares);
	Trade sellShare(int shares);

}
