package com.demo.a.service.impl;

import com.demo.a.entity.TeacherEntity;
import com.demo.a.repository.TeacherRepository;
import com.demo.a.repository.TeacherRepositoryImpl;
import com.demo.a.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

     @Autowired
     private TeacherRepositoryImpl teacherRepositoryImpl;

    @Override
    public List<TeacherEntity> getTeacherList() {
        return teacherRepositoryImpl.getTeacherList();
    }
}
