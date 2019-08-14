package br.com.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	@RequestMapping("/category/form")
	public String index() {
		System.out.println("category");
		return "/category/form";
	}

}
