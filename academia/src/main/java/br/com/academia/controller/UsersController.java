package br.com.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	@RequestMapping("/users/form")
	public String index() {
		System.out.println("users");
		return "/users/form";
	}

}
