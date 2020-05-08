package com.sachinmukherjee.spring_hibernate.controller;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sachinmukherjee.spring_hibernate.dao.UsersDAO;
import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;
import com.sachinmukherjee.spring_hibernate.entity.Users;
import com.sachinmukherjee.spring_hibernate.service.EmployeeService;
import com.sachinmukherjee.spring_hibernate.service.UsersService;

@Controller
@RequestMapping("/employee_details")
public class EmployeeDetailsController {
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	UsersService userService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<EmployeeDetails> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employee_details/index";
	}
	
	@GetMapping(path="/add")
	public String add(Model model) {
		List<Users> users = userService.getAllUsers();
		EmployeeDetails employee = new EmployeeDetails();
		model.addAttribute("userList",users);
		model.addAttribute("employee", employee);
		return "employee_details/add";
	}
	
	@GetMapping(path="/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		EmployeeDetails employee = employeeService.getEmployee(id);
		List<Users> userList = userService.getAllUsers();
		model.addAttribute("employee", employee);
		model.addAttribute("userList", userList);
		return "employee_details/edit";
	}
	
	@GetMapping(path = "/view/{id}")
	public String view(@PathVariable int id,Model model) {
		EmployeeDetails employee = employeeService.getEmployee(id);
		model.addAttribute("employee", employee);
		return "/employee_details/view";
	}
	
	@GetMapping(path="/delete/{id}")
	public String delete(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employee_details/";
	}
	
	@PostMapping("/submit")
	public String submit(EmployeeDetails employee) {
		employeeService.addEmployee(employee);
		return "redirect:/employee_details/";
	}
	
}
