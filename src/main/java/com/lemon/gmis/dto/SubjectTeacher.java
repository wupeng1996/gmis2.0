package com.lemon.gmis.dto;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "subjectTeacher")//@Table来指定和哪个数据表对应;如果省略默认表名就是student；
public class SubjectTeacher {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column
    private String teacherNumber;

    @Column
    private String teacherName;

    @Column
    private String subjectNumber;

    @Column
    private String subjectName;

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
