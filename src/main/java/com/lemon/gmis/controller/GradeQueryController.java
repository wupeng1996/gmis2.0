package com.lemon.gmis.controller;

import com.lemon.gmis.DTO.GradeQuery;

import com.lemon.gmis.service.impl.GradeQueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GradeQueryController {

    @Autowired
    private GradeQueryServiceImpl gradeQueryService;

    //根据学年和学科查询成绩(学科平均成绩，最高分，最低分)
    @GetMapping("/director1/{schoolYear}/{subjectNumber}")
    public GradeQuery findByYearAndSubject(@PathVariable("schoolYear") String schoolYear, @PathVariable("subjectNumber") String subjectNumber){
        GradeQuery gradeQuery = gradeQueryService.findByYearAndSubject(schoolYear,subjectNumber);
        return gradeQuery;
    }

    //根据教师和学科的平均成绩，最高分，最低分
    @GetMapping("/director2/{teacherNumber}/{subjectNumber}")
    public GradeQuery findByTeacherAndSubject(@PathVariable("teacherNumber") String teacherNumber, @PathVariable("subjectNumber") String subjectNumber){
        GradeQuery gradeQuery = gradeQueryService.findByTeacherAndSubject(teacherNumber, subjectNumber);
        return gradeQuery;
    }

    //根据教师姓名，学科名称和学年查看平均成绩，最高分，最低分
    @GetMapping("/teacher/{teacherNumber}/{schoolYear}/{subjectNumber}")
    public GradeQuery findByTeacherAndSchoolYearAndSubject(@PathVariable("teacherNumber") String teacherNumber, @PathVariable("schoolYear") String schoolYear, @PathVariable("subjectNumber") String subjectNumber){
        GradeQuery gradeQuery = gradeQueryService.findByTeacherAndSchoolYearAndSubject(teacherNumber, schoolYear, subjectNumber);
        return gradeQuery;
    }

    //根据学生学号，学年和学科查询成绩
    @GetMapping("/student/{studentNumber}/{schoolYear}/{subjectNumber}")
    public Float findStudentAndSchoolYearAndSubject(@PathVariable("studentNumber") String studentNumber, @PathVariable("schoolYear") String schoolYear, @PathVariable("subjectNumber") String subjectNumber){
        Float grade = gradeQueryService.findStudentAndSchoolYearAndSubject(studentNumber, schoolYear, subjectNumber);
        System.out.println(grade);
        return grade;
    }









}
