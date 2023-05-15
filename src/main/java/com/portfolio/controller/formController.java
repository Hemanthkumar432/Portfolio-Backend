package com.portfolio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.model.Form;
import com.portfolio.service.FormService;




@RestController
@CrossOrigin(origins = "https://upset-frog-production.up.railway.app")
public class formController {
	
    @Autowired
    private FormService service;
    
	 @PostMapping("/form")
	    public Form saveUser(@RequestBody Form form)
	 {
		 return service.save(form);
	 }
}
