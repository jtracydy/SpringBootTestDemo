package com.demo.w.clone;

import java.io.Serializable;

public class Student implements Cloneable,Serializable{

    private String name;
    private int age;
    private Teacher teacher;

    int [] i = {1,2,3};
    String [] s = {"a","b","c"};
    Teacher[] t = new Teacher[]{new Teacher(),new Teacher()};

    static String temp ="static_variable";

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone(){
        try {
            return (Student)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
