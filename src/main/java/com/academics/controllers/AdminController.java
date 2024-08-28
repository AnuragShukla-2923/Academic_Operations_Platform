package com.academics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@RestController
@Controller
public class AdminController {
//	@Autowired
	// public AdminDao adminDao;

	@RequestMapping("/classes")
	public String classes() {

		return "addClasses";

	}

	@RequestMapping("/addClasses")
	public String addClasses(@RequestParam("className") String className, @RequestParam("feesAmount") int feesAmount) {

		System.out.println(className + "--" + feesAmount);
		return "redirect:/academic/classes";
	}

	@RequestMapping("/session")
	public String session() {

		return "addSession";
	}

	@RequestMapping("/addsession")
	public String addSession(@RequestParam("sessionStart") String sessionStart,
			@RequestParam("sessionEnd") String sessionEnd) {

		System.out.println(sessionStart + "---" + sessionEnd);
		return "redirect:/academic/session";
	}

	@RequestMapping("/category")
	public String category() {

		return "addCategory";
	}

	@RequestMapping("/addcategory")
	public String addCategory(@RequestParam("category") String category) {
		System.out.println(category + "----");
		return "redirect:/academic/category";

	}

	@RequestMapping("/feestype")
	public String feestype() {

		return "addFeesType";
	}

	@RequestMapping("/addfeestype")
	public String addfeestype() {

		return "redirect:/feestype";
	}

	@RequestMapping("/deletefeestype")
	public String delteFeesType() {

		return "redirect:/feestype";
	}

	@RequestMapping("/deleteclasses")
	public String delteClasses() {

		return "redirect:/classes";
	}

	@RequestMapping("/deletesession")
	public String delteSession() {

		return "redirect:/session";
	}

	@RequestMapping("/deletecategory")
	public String delteCategory() {

		return "redirect:/category";
	}

}
