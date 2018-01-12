package com.demo.a.repository;

import com.demo.a.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TeacherRepository extends JpaSpecificationExecutor<TeacherEntity>,JpaRepository<TeacherEntity,Long> {
}
