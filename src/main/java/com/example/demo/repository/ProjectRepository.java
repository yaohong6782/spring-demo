package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.project.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
}
