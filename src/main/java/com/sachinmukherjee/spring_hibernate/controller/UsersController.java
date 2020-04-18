package com.sachinmukherjee.spring_hibernate.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sachinmukherjee.spring_hibernate.dao.UsersDAO;
import com.sachinmukherjee.spring_hibernate.entity.Users;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	//inject the users dao in the controller;
	@Autowired
	private UsersDAO usersDao;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		//get users from dao
		List<Users> users = usersDao.getUsers();
		//add users to model
		model.addAttribute("users",users);
		return "users/index";
	}
	
	@RequestMapping(path="/add", method = {RequestMethod.GET,RequestMethod.POST})
	public String add(Model model,HttpServletRequest request) {
		String requestType = request.getMethod();
		System.out.println(requestType);
		return "users/add";
	}
	
	@GetMapping(path="/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		Users user = usersDao.getUser(id);
		model.addAttribute("user", user);
		return "users/edit";
	}
	
	@PostMapping("/submit")
	public String submit(@ModelAttribute Users user) {
		System.out.println(user);
		usersDao.saveUser(user);
		return "redirect:/users/";
	}
	
	@GetMapping("/view/{id}")
	public String view(Model model, @PathVariable int id) {
		Users user = usersDao.getUser(id);
		model.addAttribute("user", user);
		return "/users/view";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		usersDao.deleteUser(id);
		return "redirect:/users/";
	}
}
