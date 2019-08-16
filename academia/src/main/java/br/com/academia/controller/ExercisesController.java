package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.dao.ExercisesDao;
import br.com.academia.model.ExercisesModel;

@Controller
public class ExercisesController {
	
	@Autowired
	private ExercisesDao exercisesDao;
	
	@RequestMapping("/exercises/form")
	public String index() {
		System.out.println("exercises");
		return "exercises/form";
	}
	
	@RequestMapping("/exercises/ok")
	public String save(ExercisesModel exercises) {
		exercisesDao.save(exercises);
		return "exercises/ok";
	}
}
