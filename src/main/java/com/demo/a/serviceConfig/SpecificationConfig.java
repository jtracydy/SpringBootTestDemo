package com.demo.a.serviceConfig;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Component
public class SpecificationConfig<T>{

    public Specification where(){
        return new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
                /**
                 * 1 Root ORM对象和数据表对应，
                 * 2 CriteriaBuilder 相当于SQL的where条件
                 * 3 CriteriaQuery是一个顶层的查询，它包含查询的各个部分select 、from、where、group by、order by
                 */
                List<Predicate> predicates = new ArrayList<Predicate>();
                return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
            }
        };
    }
}
