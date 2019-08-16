package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.dao.TrainingDao;
import br.com.academia.model.TrainingModel;

@Controller
public class TrainingController {
	
	@Autowired
	private TrainingDao trainingDao;
	
	@RequestMapping("/training/form")
	public String index() {
		System.out.println("training");
		return "training/form";
	}
	
	@RequestMapping("/training/ok")
	public String save(TrainingModel training) {
		trainingDao.save(training);
		return "training/ok";
	}
}
