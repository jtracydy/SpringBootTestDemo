package com.demo.a.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.a.entity.User;
import com.demo.a.service.TestService;

@Service
public class TestServiceImpl implements TestService {

//	 @Value("${magic}")
	 private String str;

	@Override
	public User save(User user) {
		System.out.println(user);
		 System.out.println("str=" + str);
		return null;
	}

}
