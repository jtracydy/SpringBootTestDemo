package com.demo.a.controller;

import com.demo.a.entity.StudentEntity;
import com.demo.a.entity.TeacherEntity;
import com.demo.a.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "Teacher")
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "教师信息")
    @ResponseBody
    @RequestMapping(value = "/getTeacherList", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
    public List<TeacherEntity> getTeacherList() {
        return teacherService.getTeacherList();
    }

}
