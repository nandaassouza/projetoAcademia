package br.com.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExercisesController {
	@RequestMapping("/exercises/form")
	public String index() {
		System.out.println("exercises");
		return "/exercises/form";
	}

}
