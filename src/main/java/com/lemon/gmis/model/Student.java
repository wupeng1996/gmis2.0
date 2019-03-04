package com.lemon.gmis.model;


import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "student")//@Table来指定和哪个数据表对应;如果省略默认表名就是student；
public class Student {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column(name = "studentName",length = 20)//这是和数据表对应的一个列
    private String studentName;

    @Column //省略默认列名就是属性名
    private String studentNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
