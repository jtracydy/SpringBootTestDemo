package com.demo.a.config;

import com.demo.b.readconfigproperties.PropsConfig;
import com.demo.t.s11.s02.YmlConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.AppleApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { AppleApplication.class })
@EnableConfigurationProperties({PropsConfig.class,YmlConfig.class})
public abstract class BaseTestCase {
}
