package com.demo.a.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s_id;

    @Column(name = "s_name")
    private String s_name;

    @Column(name = "s_age")
    private Long s_age;

    @Column(name = "s_sex")
    private Long s_sex;

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Long getS_age() {
        return s_age;
    }

    public void setS_age(Long s_age) {
        this.s_age = s_age;
    }

    public Long getS_sex() {
        return s_sex;
    }

    public void setS_sex(Long s_sex) {
        this.s_sex = s_sex;
    }
}
