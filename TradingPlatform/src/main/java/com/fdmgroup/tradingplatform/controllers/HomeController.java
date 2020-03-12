package com.fdmgroup.tradingplatform.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.tradingplatform.model.Shareholder;

@Controller
public class HomeController {
	
	private static Logger logger = LogManager.getLogger();
	
	@RequestMapping(value = {"/", "/home"}) 
	public String goToHomePage(HttpServletRequest request) {
		logger.info("Entering homepage");
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
		
		shareholder.setBalance(5000.0);
		
		return "accountHome";
	}
	

}
