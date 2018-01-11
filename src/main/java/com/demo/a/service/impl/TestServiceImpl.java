package com.demo.a.service.impl;

import com.alibaba.fastjson.JSON;
import com.demo.a.repository.TestReposotory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.a.entity.User;
import com.demo.a.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private TestReposotory testReposotory;

    @Override
    public User save(User user) {
        logger.info("user:[{}]", JSON.toJSON(user));
        testReposotory.save(user);
        return user;
    }

}
