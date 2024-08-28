package com.academics.controllers;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@MultipartConfig
@Controller
public class RestC {
	
		@PostMapping(value="/processPhoto")
		public String processPhoto( @RequestParam("pic") MultipartFile  file, Model model) throws IOException {
		System.out.println("Inside process method");
		System.out.println(Base64.getEncoder().encodeToString(file.getBytes()));
		model.addAttribute("aman", "somya");
	model.addAttribute("pic", Base64.getEncoder().encodeToString(file.getBytes()));
		return "photoUpload";
		}

}
