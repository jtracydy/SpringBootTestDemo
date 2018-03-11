package com.demo.a.service;

import com.demo.a.entity.ScEntity;

import java.util.List;

public interface ScService {

    List<ScEntity> getScDynamicQuery(int pageSize , int size);


    /**
     *
     * @param SId
     * @return
     */
    List<ScEntity> findBySId(Long SId);
}
