package com.christamoncrief.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.christamoncrief.model.Post;

@Controller
public class ProfileController {
	@GetMapping("/profile")
	public String profileController(Model model)
	{
		List<Post> myposts = new ArrayList<Post>();
		
		model.addAttribute("myposts", myposts);
		
		return "profile";
	}
}
