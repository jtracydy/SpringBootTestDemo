package com.demo.a.config;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.AppleApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { AppleApplication.class })
public abstract class BaseTestCase {
}
