package com.e_clinic.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "redirect:/login/p";
	}
	
	
	@RequestMapping("/alter")
	public String admin() {
		return "home";
	}
	
	@RequestMapping("/login/p")
	public String secure() {
		return "home";
	}
	
	@RequestMapping("/login")  
	public String home2() {
		return "login";
	}	
	
	@RequestMapping("/create_account")  
	public String create_account(@RequestParam Map<String,String> reqPar) {

		String firstname = reqPar.get("fn");
		String lastname = reqPar.get("ln");
		String username = reqPar.get("un");
		String password = reqPar.get("pw");
		String city = reqPar.get("ct");
		String state = reqPar.get("st");
		String phone = reqPar.get("ph");
		String email = reqPar.get("em");

		System.out.println(" Registered User "+firstname+" , "+ lastname+" , "+ username+" , "+ password+" , "+ city+" , "+ state+" , "+ phone+" , "+ email);
		
		
		
		return "login";
	}	
}
