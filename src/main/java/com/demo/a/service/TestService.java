package com.demo.a.service;

import com.demo.a.entity.UserEntity;

public interface TestService {

	UserEntity save(UserEntity user);

	UserEntity findByNameAndPassword(String name,String password);
}
