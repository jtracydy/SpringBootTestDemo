package com.demo.a.entity;

import javax.persistence.*;

/**
 * 成绩表：
 * 一个学生可以有多个分数
 * 一门课程可以对应多门成绩
 */

@Entity
@Table(name = "sc")
public class ScEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "s_id")
    private Long s_id;

    @Column(name = "score")
    private String score;

    @Column(name = "c_id")
    private Long c_id;

    /**
     * 根据学生的id，可以查询到它的多个课程的分数
     */


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }
}
