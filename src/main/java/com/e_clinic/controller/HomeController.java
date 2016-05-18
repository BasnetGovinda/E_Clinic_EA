package com.e_clinic.controller;

import java.util.List;
import java.util.function.BinaryOperator;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e_clinic.domain.User;
import com.e_clinic.service.UserService;

import freemarker.core.ReturnInstruction.Return;


@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName();
			
	     List<User> users = userService.getallData();
		
	     BinaryOperator<User> binaryOperator = new BinaryOperator<User>() {
			
			@Override
			public User apply(User t, User u) {
				return  u;
			}
		};
	     User user = users.stream().filter(u->u.getUsername().equalsIgnoreCase(name)).distinct().reduce(binaryOperator).get();

	      model.addAttribute("user", name);
		return "home";
	}
	
	
//	@RequestMapping("/test")  
//	public String home2() {
//		return "index";
//	}
	
	
}
