package com.demo.a.repository;

import com.demo.a.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestReposotory extends JpaSpecificationExecutor<User>,JpaRepository<User,Long> {

}
