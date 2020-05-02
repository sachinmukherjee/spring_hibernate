package com.sachinmukherjee.spring_hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompany;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;
import com.sachinmukherjee.spring_hibernate.service.OwnerCompanyOfficesService;
import com.sachinmukherjee.spring_hibernate.service.OwnerCompanyService;

@Controller
@RequestMapping("/owner_company/")
public class OwnerCompanyController {
	
	@Autowired
	private OwnerCompanyService ownerCompanyService;
	
	@Autowired
	private OwnerCompanyOfficesService ownerCompanyOfficesService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<OwnerCompany> ownerCompany = ownerCompanyService.getAllOwnerCompanies();
		model.addAttribute("ownerCompanies", ownerCompany);
		return "owner_company/index";
	}
	@GetMapping("/add/")
	public String add(Model model) {
		List<OwnerCompanyOffices> ownerCompanyOffices = new ArrayList<OwnerCompanyOffices>();
		ownerCompanyOffices.add(new OwnerCompanyOffices());
		OwnerCompany ownerCompany = new OwnerCompany();
		ownerCompany.setOwnerCompanyOffices(ownerCompanyOffices);
		model.addAttribute("ownerCompany", ownerCompany);
		return "owner_company/add";
	}
	
	@PostMapping("/submit")
	public String submit(@ModelAttribute("ownerCompany") OwnerCompany ownerCompany) {
		System.out.println(ownerCompany);
		ownerCompanyService.addOwnerCompany(ownerCompany);
		return "redirect:/owner_company/";
	}
	
	@GetMapping(path="/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		OwnerCompany ownerCompany = ownerCompanyService.getOwnerCompany(id);
		model.addAttribute("ownerCompany", ownerCompany);
		return "owner_company/edit";
	}
	
	@GetMapping("/view/{id}")
	public String view(@PathVariable int id, Model model) {
		OwnerCompany ownerCompany = ownerCompanyService.getOwnerCompany(id);
		model.addAttribute("ownerCompany", ownerCompany);
		return "owner_company/view";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		ownerCompanyService.deleteOwnerCompany(id);
		return "redirect:/owner_company/";
	}
	
	//Ajax Method
	@RequestMapping(path = "/allOffices",method = RequestMethod.GET)
	@ResponseBody
	public List<OwnerCompanyOffices> getAllOffices(@RequestParam("ownerCompanyId") int ownerCompanyId, HttpServletResponse response) {
		List<OwnerCompanyOffices> offices = ownerCompanyOfficesService.getAllOfficesOfOwnerCompanies(ownerCompanyId);
		System.out.println(offices);
		response.setContentType("application/json");
		response.setStatus(200);
		return offices;
		
	}
}
