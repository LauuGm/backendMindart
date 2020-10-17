package com.application.mindart.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.mindart.domain.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, String> {


Optional<Project> findByName(String name);



}
