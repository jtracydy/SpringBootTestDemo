package com.demo.b.readconfigproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myProps",locations = "classpath:/config/app.properties")
public class PropsConfig {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String filters;
    private String maxActive;
    private String initialSize;
    private String maxWait;

    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFilters() {
        return filters;
    }
    public void setFilters(String filters) {
        this.filters = filters;
    }
    public String getMaxActive() {
        return maxActive;
    }
    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }
    public String getInitialSize() {
        return initialSize;
    }
    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }
    public String getMaxWait() {
        return maxWait;
    }
    public void setMaxWait(String maxWait) {
        this.maxWait = maxWait;
    }
}