package com.demo.b.readconfigproperties;

import com.demo.a.config.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PropsConfigTests extends BaseTestCase{

    @Autowired
    private PropsConfig propsConfig;

    @Test
    public void testDisplayPropsValue() {
        String driverClassName = propsConfig.getDriverClassName();
        String url = propsConfig.getUrl();
        String username = propsConfig.getUsername();
        String password = propsConfig.getPassword();

        String filters = propsConfig.getFilters();
        String maxActive = propsConfig.getMaxActive();
        String initialSize = propsConfig.getInitialSize();
        String maxWait = propsConfig.getMaxWait();

        System.out.println("driverClassName -> " + driverClassName);
        System.out.println("url -> " + url);
        System.out.println("username -> " + username);
        System.out.println("password -> " + password);

        System.out.println("initialSize -> " + initialSize);
        System.out.println("maxWait -> " + maxWait);
        System.out.println("filters -> " + filters);
        System.out.println("maxActive -> " + maxActive);

    }
}