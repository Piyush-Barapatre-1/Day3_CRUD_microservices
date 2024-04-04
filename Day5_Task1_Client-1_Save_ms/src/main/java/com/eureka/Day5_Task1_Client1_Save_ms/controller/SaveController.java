package com.eureka.Day5_Task1_Client1_Save_ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.Day5_Task1_Client1_Save_ms.model.Student;
import com.eureka.Day5_Task1_Client1_Save_ms.servicei.StudentServicei;

@RestController
public class SaveController {
	
	@Autowired
	StudentServicei ssi;
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome To Save Data";
	}
	
	@PostMapping("/saveData")
	public String saveData(@RequestBody Student s)
	{
		ssi.saveData(s);
		return "Data Saved Successfully";
	}

}
