package com.emp.index.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emp.index.entities.Employee;
import com.emp.index.services.EmpService;


@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	//http://localhost:8080/indexPage
	@RequestMapping("/indexPage")
	public String indexPage() {
	
		return "index_form";
	}
	
	@RequestMapping("/saveIndex")
	public String saveIndex(@ModelAttribute("emp") Employee emp , @RequestParam("Q1") int Q1,
			@RequestParam("Q2") int Q2, @RequestParam("Q3") int Q3,
			@RequestParam("Q4") int Q4, @RequestParam("Q5") int Q5, Model model) {
	   
		double Q = empService.indexCalculate( emp, Q1, Q2, Q3, Q4, Q5);
		
		model.addAttribute("msg",Q);
		
		return "index_result";
	}
}
