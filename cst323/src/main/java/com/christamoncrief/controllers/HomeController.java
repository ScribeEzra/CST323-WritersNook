package com.christamoncrief.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.christamoncrief.model.Post;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homeController(Model model)
	{
		List<Post> posts = new ArrayList<Post>();
		
		posts.add(new Post(1, "Because I Could Not Stop For Death", "Because I could not stop for Death—\r\n"
				+ "He kindly stopped for me—\r\n"
				+ "The Carriage held but just Ourselves—\r\n"
				+ "And Immortality.\r\n"
				+ "\r\n"
				+ "We slowly drove—He knew no haste\r\n"
				+ "And I had put away\r\n"
				+ "My labor and my leisure too,\r\n"
				+ "For His Civility—\r\n"
				+ "\r\n"
				+ "We passed the School, where Children strove\r\n"
				+ "At Recess—in the Ring—\r\n"
				+ "We passed the fields of Gazing Grain—\r\n"
				+ "We passed the Setting Sun—\r\n"
				+ "\r\n"
				+ "Or rather—He passed Us—\r\n"
				+ "The Dews drew quivering and chill—\r\n"
				+ "For only Gossamer, my Gown—\r\n"
				+ "My Tippet—only Tulle—\r\n"
				+ "\r\n"
				+ "We paused before a House that seemed\r\n"
				+ "A Swelling of the Ground—\r\n"
				+ "The Roof was scarcely visible—\r\n"
				+ "The Cornice—in the Ground—\r\n"
				+ "\r\n"
				+ "Since then—'tis Centuries—and yet\r\n"
				+ "Feels shorter than the Day\r\n"
				+ "I first surmised the Horses' Heads\r\n"
				+ "Were toward Eternity—", "Emily Dickinson"));
		posts.add(new Post(2, "Do Not Stand At My Grave and Weep", "  Do not stand\r\n"
				+ "    By my grave, and weep.\r\n"
				+ "    I am not there,\r\n"
				+ "  I do not sleep-\r\n"
				+ "I am the thousand winds that blow\r\n"
				+ "I am the diamond glints in snow\r\n"
				+ "I am the sunlight on ripened grain,\r\n"
				+ "I am the gentle, autumn rain.\r\n"
				+ "As you awake with morning’s hush,\r\n"
				+ "I am the swift up-flinging rush\r\n"
				+ "Of quiet birds in circled flight,\r\n"
				+ "I am the day transcending soft night.\r\n"
				+ "  Do not stand\r\n"
				+ "    By my grave, and cry-\r\n"
				+ "  I am not there.\r\n"
				+ "    I did not die.\r\n", "Clare Harner"));
		posts.add(new Post(3, "Good Timber", "The tree that never had to fight\r\n"
				+ "     For sun and sky and air and light,\r\n"
				+ "But stood out in the open plain\r\n"
				+ "     And always got its share of rain,\r\n"
				+ "Never became a forest king\r\n"
				+ "     But lived and died a scrubby thing.\r\n"
				+ "\r\n"
				+ "The man who never had to toil\r\n"
				+ "     To gain and farm his patch of soil,\r\n"
				+ "Who never had to win his share\r\n"
				+ "     Of sun and sky and light and air,\r\n"
				+ "Never became a manly man\r\n"
				+ "     But lived and died as he began.\r\n"
				+ "\r\n"
				+ "Good timber does not grow with ease,\r\n"
				+ "     The stronger wind, the stronger trees,\r\n"
				+ "The further sky, the greater length,\r\n"
				+ "     The more the storm, the more the strength.\r\n"
				+ "By sun and cold, by rain and snow,\r\n"
				+ "     In trees and men good timbers grow.\r\n"
				+ "\r\n"
				+ "Where thickest lies the forest growth\r\n"
				+ "     We find the patriarchs of both.\r\n"
				+ "And they hold counsel with the stars\r\n"
				+ "     Whose broken branches show the scars\r\n"
				+ "Of many winds and much of strife.\r\n"
				+ "     This is the common law of life.\r\n", "Douglas Malloch"));
		
		model.addAttribute("posts", posts);
		//model.addAttribute("title", "Post Title");
		//model.addAttribute("body", "Post Body");
		//model.addAttribute("author", "Post Author");
		
		return "home";
	}
}
