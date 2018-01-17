package com.demo.a.repository;

import com.demo.a.entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component
public  class TeacherRepositoryImpl{

     @Autowired
     private EntityManager entityManager;

     public List<TeacherEntity> getTeacherList(){
         String sql = "select * from teacher";
         Query createQuery = entityManager.createQuery(sql);
         List<TeacherEntity> data = createQuery.getResultList();

         Query createNamedQueryQuery =  entityManager.createNamedQuery(sql);
         List<TeacherEntity> nameData = createNamedQueryQuery.getResultList();

         Query createNativeQuery = entityManager.createNativeQuery(sql);
         List<TeacherEntity> nativedata = createNativeQuery.getResultList();

         return data;
     }
}
