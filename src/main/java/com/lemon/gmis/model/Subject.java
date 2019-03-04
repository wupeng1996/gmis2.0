package com.lemon.gmis.model;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "subject")//@Table来指定和哪个数据表对应;如果省略默认表名就是subject；
public class Subject {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column
    private String subjectName;

    @Column
    private String subjectNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }
}
