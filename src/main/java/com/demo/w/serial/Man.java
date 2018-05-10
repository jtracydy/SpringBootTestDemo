package com.demo.w.serial;

import java.io.Serializable;

public class Man implements Serializable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
