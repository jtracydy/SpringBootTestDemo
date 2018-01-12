package com.demo.a.controller;

import com.demo.a.entity.ScEntity;
import com.demo.a.entity.StudentEntity;
import com.demo.a.entity.UserEntity;
import com.demo.a.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "Student")
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "学生信息")
    @ResponseBody
    @RequestMapping(value = "/queryByName", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
    public StudentEntity queryByName(String name) {
        return studentService.queryByName(name);
    }
    @ApiOperation(value = "学生信息")
    @ResponseBody
    @RequestMapping(value = "/queryListByName", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
    public List<ScEntity> queryListByName(String name) {
        return studentService.queryListByName(name);
    }
}
