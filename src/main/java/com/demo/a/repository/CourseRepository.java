package com.demo.a.repository;

import com.demo.a.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepository  extends JpaSpecificationExecutor<CourseEntity>,JpaRepository<CourseEntity,Long> {
}
