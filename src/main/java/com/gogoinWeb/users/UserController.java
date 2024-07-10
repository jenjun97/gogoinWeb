package com.gogoinWeb.users;

import java.util.List;

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

	@GetMapping("/home/request")
	public String showRequestForm() {
		System.out.println("UserController.showRequestForm()");
		return "users/request";
	}

	@PostMapping("/home/reply")
	public String processRequest(@RequestParam Integer id, Model model) {
		System.out.println("UserController.processRequest()");
		List<UserModel> userModelList = userService.getUserById(id);
		model.addAttribute("users", userModelList);
		return "users/reply";
	}
}
