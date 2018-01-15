package com.demo.a.repository;

import com.demo.a.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRrepository extends JpaSpecificationExecutor<UserEntity>,JpaRepository<UserEntity,Long> {


    UserEntity findByNameAndPassword(String name,String password);
}
