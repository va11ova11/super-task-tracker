package com.myapp.supertasktracker.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projects")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "name")
  String name;

  @Column(name = "created_at")
  LocalDateTime createdAt = LocalDateTime.now();

  @Column(name = "update_at")
  LocalDateTime updateAt = LocalDateTime.now();

  @OneToMany
  @JoinColumn(name = "project_id")
  List<TaskState> taskStates = new ArrayList<>();
}
