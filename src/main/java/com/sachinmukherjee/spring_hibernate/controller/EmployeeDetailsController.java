package com.sachinmukherjee.spring_hibernate.controller;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachinmukherjee.spring_hibernate.dao.EmployeeDetailsDAO;
import com.sachinmukherjee.spring_hibernate.dao.UsersDAO;
import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;
import com.sachinmukherjee.spring_hibernate.entity.Users;

@Controller
@RequestMapping("/employee_details")
public class EmployeeDetailsController {
	
	@Autowired
	EmployeeDetailsDAO employeeDetailsDAO;
	@Autowired
	UsersDAO usersDAO;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<EmployeeDetails> employees = employeeDetailsDAO.getEmployees();
		model.addAttribute("employees", employees);
		return "employee_details/index";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		List<Users> users = usersDAO.getUsers();
		EmployeeDetails employee = new EmployeeDetails();
		model.addAttribute("userList",users);
		model.addAttribute("employee", employee);
		return "employee_details/add";
	}
	
	@PostMapping("/submit")
	public String submit(EmployeeDetails employee) {
		System.out.println(employee);
		employeeDetailsDAO.saveEmployee(employee);
		return "redirect:/employee_details/";
	}
	
}
