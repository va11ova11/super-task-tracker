package com.myapp.supertasktracker.dao;

import com.myapp.supertasktracker.model.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskState, Long> {

}
