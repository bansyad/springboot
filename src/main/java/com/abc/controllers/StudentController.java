package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.StudentDto;
import com.abc.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	/*
	 * @GetMapping(value = "/{id}") public StudentDto getById(@PathVariable Integer
	 * id) {
	 * 
	 * return studentService.getDummyStudent(id); }
	 * 
	 * @PostMapping(value = "{id}") public StudentDto studentDetails(@PathVariable
	 * Integer id) { return studentService.createStudent();
	 * 
	 * }
	 */

	@GetMapping(value = "/{id}")
	public StudentDto getStudents(@PathVariable Integer id) {

		return studentService.getStudent(id);

	}
}
