package com.demo.a.repository;

import com.demo.a.entity.CourseEntity;
import com.demo.a.entity.ScEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScRepository extends JpaSpecificationExecutor<ScEntity>,JpaRepository<ScEntity,Long> {
}
