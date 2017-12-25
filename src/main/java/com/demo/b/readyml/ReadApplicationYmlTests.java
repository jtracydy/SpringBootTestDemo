package com.demo.b.readyml;

import com.demo.a.config.BaseTestCase;
import com.demo.t.s11.s02.YmlConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ReadApplicationYmlTests extends BaseTestCase {

    @Autowired
    private YmlConfig ymlConfig;

    @Test
    public void testDisplayYmlValue() throws JsonProcessingException {
        System.out.println("simpleProp: " + ymlConfig.getSimpleProp());

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(ymlConfig.getArrayProps()));
        System.out.println("listProp1: " + objectMapper.writeValueAsString(ymlConfig.getListProp1()));
        System.out.println("listProp2: " + objectMapper.writeValueAsString(ymlConfig.getListProp2()));
        System.out.println("mapProps: " + objectMapper.writeValueAsString(ymlConfig.getMapProps()));

    }
}