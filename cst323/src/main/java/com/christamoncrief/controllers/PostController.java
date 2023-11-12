package com.christamoncrief.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.christamoncrief.model.Post;
import com.christamoncrief.model.User;

@Controller
@RequestMapping("/addpost")
public class PostController {
	@GetMapping("")
	public String postController(Model model)
	{
		model.addAttribute("postModel", new Post());
		return "addpost";
	}
	
	@GetMapping("/submitpost")
	public String submitPost(@ModelAttribute("postModel") Post postModel, Model model, BindingResult bindingResult) {
		
		model.addAttribute("postModel", postModel);
		//Add post to database
		return "home";
	}
}
