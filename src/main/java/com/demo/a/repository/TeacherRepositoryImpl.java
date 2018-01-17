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

     public List<TeacherEntity> getTeacherListImpl(){
         /**
          * createQuery是执行JPQL查询的
          */
         String jpql = "select t from TeacherEntity t";
         Query createQuery = entityManager.createQuery(jpql);
         List<TeacherEntity> data = createQuery.getResultList();

         /**
          * createNativeQuery是执行原生sql的
          */
         String sql = "SELECT t.`t_id`,t.`t_name`,c.`c_id`,c.`c_name`\n" +
                 "FROM teacher t LEFT JOIN  course c\n" +
                 "ON t.`t_id` = c.`t_id`\n";

         Query createNativeQuery = entityManager.createNativeQuery(sql);
         List<TeacherEntity> nativedata = createNativeQuery.getResultList();

         return null;
     }
}
