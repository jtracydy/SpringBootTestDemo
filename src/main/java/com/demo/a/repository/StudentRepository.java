package com.demo.a.repository;

import com.demo.a.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaSpecificationExecutor<StudentEntity>,JpaRepository<StudentEntity,Long> {
}
