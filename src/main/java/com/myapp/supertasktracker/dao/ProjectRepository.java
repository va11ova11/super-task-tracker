package com.myapp.supertasktracker.dao;

import com.myapp.supertasktracker.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
