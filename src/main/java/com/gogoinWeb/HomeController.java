package com.gogoinWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gogoinWeb.database.DbSource;

@Controller
public class HomeController {

	@Autowired
	DbSource dbSource;

	@RequestMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@GetMapping({ "/index", "/index.html", "/index.jsp" })
	public String index() throws SQLException {
		return "index";
	}

	@GetMapping("/home")
	public String home() {
		return "home/home";
	}
}
