package com.demo.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.a.entity.User;
import com.demo.a.service.TestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Test")
@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService TestService;

	@ApiOperation(value = "测试登录")
	@ResponseBody
	@RequestMapping(value = "/save", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
	public User testTest(String name, String pwd) {
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		return TestService.save(user);
	}
}
