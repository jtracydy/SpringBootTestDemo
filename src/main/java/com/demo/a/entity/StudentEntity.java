package com.demo.a.entity;

import javax.persistence.*;
import java.util.List;

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
    private String s_sex;

    /**
     * 学生跟成绩是一对多的关系，一个学生有多门成绩
     */
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name="s_id", referencedColumnName="s_id",
            insertable = false, updatable = false)
    private List<ScEntity> scEntities;

    /**
     * 一个学生对应多个老师
     */
    @OneToMany(cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @JoinColumn(name="s_id", referencedColumnName="s_id",
            insertable = false, updatable = false)
    private List<TeacherEntity> thEntity;


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

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public List<ScEntity> getScEntities() {
        return scEntities;
    }

    public void setScEntities(List<ScEntity> scEntities) {
        this.scEntities = scEntities;
    }
}
