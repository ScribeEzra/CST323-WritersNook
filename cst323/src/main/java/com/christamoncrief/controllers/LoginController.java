package com.christamoncrief.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.christamoncrief.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("")
	public String displayLoginForm(Model model)
	{
		model.addAttribute("userModel", new User());
		return "login";
	}
	@PostMapping("/processLogin")
	public String processLogin(@Valid User userModel, BindingResult bindingResult, Model model)
	{
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("userModel", userModel);
			return "login";
		}
		
		model.addAttribute("userModel", userModel);
		return "profile";
	}
}
