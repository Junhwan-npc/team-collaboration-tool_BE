package me.seungwoo.repository.project;

import me.seungwoo.domain.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // JpaRepository<Project 엔티티, Project의 PK(ID) 타입>
}
