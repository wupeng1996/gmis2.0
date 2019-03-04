package com.lemon.gmis.model;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类
@Table(name = "teacherSubject")//@Table来指定和哪个数据表对应;如果省略默认表名就是student；
public class TeacherSubject {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column
    private Integer teacherId;

    @Column
    private Integer subjectId;

    @Column
    private String schoolYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }
}
