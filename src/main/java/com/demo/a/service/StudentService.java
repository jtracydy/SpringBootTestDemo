package com.demo.a.service;

import com.demo.a.entity.ScEntity;
import com.demo.a.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity queryByName(String name);

    List<ScEntity> queryListByName(String name);
}
