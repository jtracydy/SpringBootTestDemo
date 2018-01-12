package com.demo.a.service.impl;

import com.demo.a.entity.ScEntity;
import com.demo.a.entity.StudentEntity;
import com.demo.a.repository.StudentRepository;
import com.demo.a.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity queryByName(String name) {
        return studentRepository.queryByName(name);
    }

    @Override
    public List<ScEntity> queryListByName(String name) {
        StudentEntity entity = studentRepository.queryByName(name);
        return entity.getScEntities();
    }
}
