package com.lemon.gmis.entity;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "gradeSheet")//@Table来指定和哪个数据表对应;如果省略默认表名就是gradeSheet；
public class GradeSheet {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column
    private Integer studentId;

    @Column
    private Integer teacherSubjectId;

    @Column
    private Float grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTeacherSubjectId() {
        return teacherSubjectId;
    }

    public void setTeacherSubjectId(Integer teacherSubjectId) {
        this.teacherSubjectId = teacherSubjectId;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
