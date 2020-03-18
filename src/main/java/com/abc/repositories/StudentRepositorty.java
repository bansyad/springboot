package com.abc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.entities.StudentEntity;

@Repository
public interface StudentRepositorty extends CrudRepository<StudentEntity, Integer> {
//	List<StudentEntity>findById(Integer id);

}
