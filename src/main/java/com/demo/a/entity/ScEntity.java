package com.demo.a.entity;

import javax.persistence.*;

@Entity
@Table(name = "sc")
public class ScEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s_id;

    @Column(name = "score")
    private String score;

    @Column(name = "c_id")
    private Long c_id;

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
