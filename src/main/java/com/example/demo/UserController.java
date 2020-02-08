package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@PostMapping("/home")
	public String dbReturn(@RequestParam("text1")String str, Model model) {
		int id = Integer.parseInt(str);
		UserEntity user = userService.findOne(id);

		model.addAttribute("id",user.getId());
		model.addAttribute("name", user.getName());

		return "returnDB";



	}
}
