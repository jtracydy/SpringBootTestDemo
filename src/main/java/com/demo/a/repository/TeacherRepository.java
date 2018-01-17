package com.demo.a.repository;

import com.demo.a.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TeacherRepository extends JpaSpecificationExecutor<TeacherEntity>,JpaRepository<TeacherEntity,Long> {

    @Query(value = "select t from TeacherEntity t")
    List<TeacherEntity> getTeacherList();
}
