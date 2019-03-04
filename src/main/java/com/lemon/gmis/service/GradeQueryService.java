package com.lemon.gmis.service;

import com.lemon.gmis.dto.GradeQuery;

public interface GradeQueryService {

    //根据学科和学年查询成绩(学科平均成绩，最高分，最低分)
    public GradeQuery findByYearAndSubject(String schoolYear, String subject);

    //根据教师和学科的平均成绩，最高分，最低分
    public GradeQuery findByTeacherAndSubject(String teacherNumber, String subjectNumber);

    //根据教师姓名，学科名称和学年查看平均成绩，最高分，最低分
    public GradeQuery findByTeacherAndSchoolYearAndSubject(String teacherNumber, String schoolYear, String subjectNumber);

    //根据学生学号，学年和学科查询成绩
    public Float findStudentAndSchoolYearAndSubject(String studentNumber, String schoolYear, String subjectNumber);

}
