package com.fdmgroup.tradingplatform.controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.tradingplatform.dao.StockDao;
import com.fdmgroup.tradingplatform.dao.UserDao;
import com.fdmgroup.tradingplatform.model.Shareholder;
import com.fdmgroup.tradingplatform.model.Stock;

@Controller
public class HomeController implements ApplicationContextAware{
	
	private ApplicationContext context;
	private static Logger log = LogManager.getLogger();
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
	@RequestMapping(value = {"/", "/home"}) 
	public String goToHomePage(HttpServletRequest request) {
		log.info("Entering homepage");
		return "home";
	}
	
	@RequestMapping(value = "/register")
	public String goToRegister(Model model) {
		model.addAttribute("shareholder", new Shareholder());
		return "registerUser";
	}
	
	@RequestMapping(value = "/login")
	public String goToLogin(HttpServletRequest req, Model model) {
		model.addAttribute("shareholder", new Shareholder());
		return "loginUser";
	}
	
	@RequestMapping(value = "/createUser", method=RequestMethod.POST)
	public String createUser(HttpServletRequest request, @ModelAttribute("shareholder")Shareholder shareholder) {
		
		shareholder.setBalance(new BigDecimal(5000.0));
		UserDao userDao = context.getBean("userDao", UserDao.class);
		userDao.add(shareholder);
		return "loginUser";
	}
	
	@RequestMapping(value = "/processLogin", method=RequestMethod.POST)
	public String verifyUserLogin(HttpServletRequest req) {
		int errorCheck = 0;
		UserDao userDao = context.getBean("userDao", UserDao.class);
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Shareholder userFromDB = userDao.findByEmail(email);
		
		if(userFromDB == null) {
			errorCheck = 1;
			req.setAttribute("errorCheck", errorCheck);
			return "loginUser";
		}
		
		String emailCheck = userFromDB.getEmail();
		String passwordCheck = userFromDB.getPassword();
		
		if(email.equals(emailCheck) && password.equals(passwordCheck)) {
			req.getSession().setAttribute("shareholder", userFromDB);
			return "accountHome";
		} else {
			errorCheck = 2;
			req.setAttribute("errorCheck", errorCheck);
			return "loginUser";
		} 
	}

	@RequestMapping(value = "/createStock")
	public String goToCreateStock(HttpServletRequest req) {
		return "createStock";
	}
	
	@RequestMapping(value = "/registerStock", method=RequestMethod.POST)
	public String registerStock(HttpServletRequest req, @ModelAttribute("stock") Stock stock) {
		StockDao stockDao = context.getBean("stockDao",StockDao.class);
		
		List<Stock>stocks = stockDao.list();		
		if(stocks.contains(stock)) {
			log.error("Stock already exists");
			return "createStock";
		}
		
		stockDao.add(stock);
		
		return "viewStocks";
	}
	
	@RequestMapping(value = "/viewStocks", method=RequestMethod.POST)
	public String viewStocks(HttpServletRequest req) {
		StockDao stockDao = context.getBean("stockDao", StockDao.class);
		List<Stock>stocks = stockDao.list();
		req.setAttribute("stocks", stocks);
		
		return "viewStocks";
	}
}
