package com.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSON;
import com.demo.a.config.BaseTestCase;
import com.demo.a.config.ReadPropertiesConfig;
import com.demo.a.entity.User;

public class ReadPropertiesConfigTest extends BaseTestCase {

	@Autowired
	private ReadPropertiesConfig config;

	@Value("#{1}")
	private String spelAttr;

	@Test
	public void getPropertiesTest() {
		config.getProperties();
	}

	@Test
	public void getUserInfoTest() {
		User user = config.getUserInfo();
		System.out.println(JSON.toJSONString(user));
	}

}
