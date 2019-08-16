package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.dao.UsersDao;
import br.com.academia.model.UsersModel;

@Controller
public class UsersController {

	@Autowired
	private UsersDao usersDao;

	@RequestMapping("/users/form")
	public String index() {
		System.out.println("users");
		return "users/form";
	}

	@RequestMapping("/users/ok")
	public String save(UsersModel users) {
		usersDao.save(users);
		return "users/ok";
	}
}
