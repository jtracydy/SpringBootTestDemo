package com.demo.w.serial;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{

    private String name;
    private int age;
    private Gender gender;

    private Man man;

    private transient Women women;

    private List<Women> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Women getWomen() {
        return women;
    }

    public void setWomen(Women women) {
        this.women = women;
    }

    public List<Women> getList() {
        return list;
    }

    public void setList(List<Women> list) {
        this.list = list;
    }
}
