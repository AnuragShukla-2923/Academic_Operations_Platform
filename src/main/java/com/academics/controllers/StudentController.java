package com.academics.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.academics.dao.adminDao;
import com.academics.dto.AdmissionDto;
import com.academics.dto.FeesClassesDto;



@Controller
public class StudentController {
	
	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
	
	@RequestMapping("/welcome")
	public String welcome( ) {
		return "welcome";
	}
	
	
	@RequestMapping("/photoUpload")
	public String photoUpload() {
		return "photoUpload";
	}
	
	@RequestMapping("/admissionForm")
	public String admissionForm(Model model, AdmissionDto dto ) {
		List<FeesClassesDto> classesList = adminDao.listClasses();
		List<String> listCategory = adminDao.listCategory();
		List<String> session = adminDao.listSession();
		
		model.addAttribute("session", session);
		model.addAttribute("classesList", classesList);
		model.addAttribute("listCategory", listCategory);
		model.addAttribute("admissionDto", dto);
		return "admissionForm";
	}	
	
	@RequestMapping(value ="/stusignup", method = RequestMethod.GET)
	public String stuSignup() {

		return "stuSignup";
	}
	
	@RequestMapping("/adLogin")
	public String adLogin() {

		return "adLogin";
	}
	
	@RequestMapping("/submitFees")
	public String submitFees() {
		
		return "submitFees";
	}
	
	@RequestMapping("/feesSummary")
	public String feesSummary() {
			
			return "feesSummary";
	}
	
	
	@RequestMapping("/feesReport")
	public String feesReport() {
			return "feesReport";
	}
	
	@RequestMapping("/feesReportGenerate")
	public String feesReportGenerate() {
		
		return "feesReport";
	}	
	
	@RequestMapping("/feesProcessing")
	public String feesProcessing() {
			
		
			return "redirect:/feesSummary";
	}
	
	
	
	@RequestMapping(value="/searchStudents")
	public String searchByBranch() {	
		
		return "studentsList";
	}
	
	@RequestMapping("/searchByRollNo")
	public String searchByRollNo() {
		
		return "studentsList";
	}
	
	@RequestMapping("/searchByClass")
	public String searchByClass() {
		
		return "studentsList";
	}
	
	@RequestMapping("/studentsList")
	public String studentsList() {
		
		return "studentsList";
	}
	
	
	@RequestMapping("/addStudents")
	public String addStudents() {
		
		return "registerStudents";
	}
	
	@RequestMapping("/updateStudents")
	public String updateStudent() {
		
		return "admissionForm";
	}
	
	
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent() {
		
		return "redirect:/studentsList";
	}
	
	

	@RequestMapping("/addStudentsToDb")
	public String addStudentsToDb() {
		
		return "redirect:/addStudents";
	}
	
	
	@RequestMapping(value="/saveAdmissison",method=RequestMethod.POST)
	public String saveAdmissison()  {
	
//		return "redirect:/studentsList";
		return "addSession";  //for testing purpose i added this line remove it 
		
	}
	
	@RequestMapping("/customlogin")
	public String customLogin() {

		return "customLogin";
	}
	
	@ResponseBody
	@RequestMapping("/accessdenied")
	public String accessDenied() {
		
		return "Access Denied";
	}
}
