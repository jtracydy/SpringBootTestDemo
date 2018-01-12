package com.demo.a.repository;

import com.demo.a.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaSpecificationExecutor<StudentEntity>,JpaRepository<StudentEntity,Long> {

    @Query(value = "from StudentEntity s where s.s_name =?1")
    StudentEntity queryByName(String name);
}
