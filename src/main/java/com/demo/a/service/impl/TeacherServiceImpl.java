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

     @Autowired
     private TeacherRepository teacherRepository;

    @Override
    public List<TeacherEntity> getTeacherList() {
        List<TeacherEntity> list =teacherRepository.getTeacherList();
        if(list.size() !=0){
            for(TeacherEntity entity : list){
                System.out.println( entity.getT_name());
            }
        }
        List<TeacherEntity> listImpl =teacherRepositoryImpl.getTeacherListImpl();

        if(listImpl.size() !=0){
            for(TeacherEntity entity : listImpl){
                System.out.println( entity.getT_name());
            }
        }
        return null;
    }
}
