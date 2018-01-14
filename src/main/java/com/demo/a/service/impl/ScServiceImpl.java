package com.demo.a.service.impl;

import com.demo.a.entity.ScEntity;
import com.demo.a.repository.ScRepository;
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

@Service
public class ScServiceImpl implements ScService {

    @Autowired
    private SpecificationConfig<ScEntity> specificationConfig;

    @Autowired
    private ScRepository scRepository;

    @Override
    public List<ScEntity> getScDynamicQuery(int pageSize, int size) {

        Specification<ScEntity> specification = specificationConfig.where();
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(size, pageSize, sort);
        Page<ScEntity> page = null;
        do {
            page = scRepository.findAll(pageable);
        } while (page.hasNext());
        return null;
    }
}
