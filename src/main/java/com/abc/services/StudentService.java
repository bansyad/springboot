package com.abc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.abc.dtos.StudentDto;
import com.abc.entities.StudentEntity;
import com.abc.repositories.StudentRepositorty;

@Service
public class StudentService {

	@Autowired
	private StudentRepositorty studentRepositorty;

	public StudentDto getDummyStudent(Integer id) {

		StudentDto studentDto = new StudentDto();
		studentDto.setId(1);
		studentDto.setName("jayRam");
		// studentDto.setAddress("Manipalkocheu");
		studentDto.setEmail("balckmamma@gmail.com");
		studentDto.setPhone("9856028880");

		return studentDto;
	}

	public StudentDto createStudent() {

		return null;
	}

	public StudentDto getStudent(Integer id) {
		Optional<StudentEntity> std = studentRepositorty.findById(id);
		StudentDto dto = null;
		if (std.isPresent()) {
			dto = new StudentDto();
			String firstName = StringUtils.isEmpty(std.get().getFirstName()) ? "" : std.get().getFirstName();
			String lastName = StringUtils.isEmpty(std.get().getLaastName()) ? "" : std.get().getLaastName();

			dto.setId(std.get().getId());
			dto.setName(firstName + lastName);
			dto.setEmail(std.get().getEmail());
			dto.setPhone(std.get().getPhone());

		}
		return dto;
	}

}
