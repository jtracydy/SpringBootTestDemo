package com.demo.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.a.entity.UserEntity;
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
	public UserEntity testTest(String name, String pwd) {
		UserEntity user = new UserEntity();
		user.setName(name);
		user.setPassword(pwd);
		return TestService.save(user);
	}

	@ApiOperation(value = "根据密码查询用户信息")
	@ResponseBody
	@RequestMapping(value = "/findBy", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
	public UserEntity findByNameAndPassword(String name,String password){
		UserEntity user = new UserEntity();
		user.setName(name);
		user.setPassword(password);
		return TestService.findByNameAndPassword(name,password);
	}
}
