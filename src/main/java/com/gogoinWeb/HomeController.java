package com.gogoinWeb;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String root() {
		System.out.println("HomeController.root()");
		return "redirect:/index";
	}

	@GetMapping({ "/index", "/index.html", "/index.jsp" })
	public String index() throws SQLException {
		System.out.println("HomeController.index()");
		return "index";
	}

	@GetMapping("/home")
	public String home() {
		System.out.println("HomeController.home()");
		return "home/home";
	}
}
