package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.dao.CategoryDao;
import br.com.academia.model.CategoryModel;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping("/category/form")
	public String index() {
		System.out.println("category");
		return "category/form";
	}
	
	@RequestMapping("/category/ok")
	public String save(CategoryModel category) {
		categoryDao.save(category);
		return "category/ok";
	}
}
