package com.demo.a.repository;


import com.demo.a.entity.ScEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class ScRepositoryImpl {

    @Autowired
    private EntityManager entityManager;

    public List<ScEntity> findBySId(Long sId){

        String sql = "select * from sc where s_id = '" + sId + "'";
        Query query = entityManager.createNativeQuery(sql);
        List<ScEntity> list = query.getResultList();

        //List listMap = query.getResultList();

        String sqlStr = "select s from ScEntity s where s.s_id = '" + sId + "'";
        query = entityManager.createQuery(sqlStr) ;
        List<ScEntity> listStr = query.getResultList();


        return list;
    }
}
