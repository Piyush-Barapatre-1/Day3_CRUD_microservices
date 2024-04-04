package com.eureka.Day5_Task1_Client1_Save_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.Day5_Task1_Client1_Save_ms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
