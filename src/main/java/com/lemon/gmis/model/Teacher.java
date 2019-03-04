package com.lemon.gmis.model;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "teacher")//@Table来指定和哪个数据表对应;如果省略默认表名就是teacher；
public class Teacher {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id; //主键

    @Column
    private String teacherName; //老师姓名

    @Column
    private String teacherNumber;   //老师教职工号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }
}
