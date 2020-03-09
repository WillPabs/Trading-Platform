package com.fdmgroup.tradingplatform.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home") 
	public String goToHomePage(HttpServletRequest request) {
		return "home";
	}

}
