package com.demo.a.service.impl;

import com.demo.a.entity.ScEntity;
import com.demo.a.repository.ScRepository;
import com.demo.a.repository.ScRepositoryImpl;
import com.demo.a.service.ScService;
import com.demo.a.serviceConfig.SpecificationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScServiceImpl implements ScService {

    @Autowired
    private SpecificationConfig<ScEntity> specificationConfig;

    @Autowired
    private ScRepository scRepository;

    @Autowired
    private ScRepositoryImpl scRepositoryImpl;

    @Override
    public List<ScEntity> getScDynamicQuery(int pageSize, int size) {
        Specification<ScEntity> specification = specificationConfig.where();
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(pageSize,size, sort);
        Page<ScEntity> page = scRepository.findAll(specification,pageable);
        List<ScEntity> list = page.getContent();
        if(list.size()>0){
            for(ScEntity entity : list){
                System.out.println(entity.getId());
            }
        }
        return page.getContent();
    }

    @Override
    public List<ScEntity> findBySId(Long sId) {
        List<ScEntity> list = scRepositoryImpl.findBySId(sId);
        return list;
    }

    public List<ScEntity> getScDynamicQueryPage(int pageSize, int size, Map<String, String> map) {
        return scRepository.findAll(specificationConfig.whereMap(map),
                new PageRequest(pageSize, size, new Sort(Sort.Direction.ASC, "id"))).
                getContent();
    }
}
