package com.eureka.Day5_Task1_Client1_Save_ms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.Day5_Task1_Client1_Save_ms.model.Student;
import com.eureka.Day5_Task1_Client1_Save_ms.repository.StudentRepository;
import com.eureka.Day5_Task1_Client1_Save_ms.servicei.StudentServicei;

@Service
public class StudentServiceImpl implements StudentServicei{

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveData(Student s) {
		
		sr.save(s);
		
	}

}
