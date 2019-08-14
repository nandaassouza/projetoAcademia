package br.com.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrainingController {
	@RequestMapping("/training/form")
	public String index() {
		System.out.println("training");
		return "/training/form";
	}

}
