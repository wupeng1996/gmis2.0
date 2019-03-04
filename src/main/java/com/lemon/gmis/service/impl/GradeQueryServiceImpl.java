package com.lemon.gmis.service.impl;

import com.lemon.gmis.DTO.GradeQuery;
import com.lemon.gmis.DTO.SubjectTeacher;
import com.lemon.gmis.model.*;
import com.lemon.gmis.dao.*;
import com.lemon.gmis.service.GradeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class GradeQueryServiceImpl implements GradeQueryService {

    @Autowired
    private GradeSheetDao gradeSheetDao;

    @Autowired
    private TeacherSubjectDao teacherSubjectDao;

    @Autowired
    private SubjectDao subjectDao;


    //根据学科和学年查询成绩(学科平均成绩，最高分，最低分)
    public GradeQuery findByYearAndSubject(String schoolYear, String subject){
        Float[] grades = gradeSheetDao.findByYearAndSubject(schoolYear, subject);
        //创建一个拥有最大值，最小值，平均值的实体类
        GradeQuery gradeQuery = new GradeQuery();
        //对成绩数组进行升序排列
        Arrays.sort(grades);
        //手动封装实体类数据
        gradeQuery.setMinScore(grades[0]);
        gradeQuery.setMaxScore(grades[grades.length-1]);
        float sum=0;
        for (int i=0; i<grades.length; i++){
            sum+=grades[i];
        }
        gradeQuery.setAveScore(sum/grades.length);
        return gradeQuery;
    }

    //根据教师和学科的平均成绩，最高分，最低分
    public GradeQuery findByTeacherAndSubject(String teacherNumber, String subjectNumber){
        Float[] grades = gradeSheetDao.findByTeacherAndSubject(teacherNumber, subjectNumber);
        //创建一个拥有最大值，最小值，平均值的实体类
        GradeQuery gradeQuery = new GradeQuery();
        //对成绩数组进行升序排列
        Arrays.sort(grades);
        //手动封装实体类数据
        gradeQuery.setMinScore(grades[0]);
        gradeQuery.setMaxScore(grades[grades.length-1]);
        float sum=0;
        for (int i=0; i<grades.length; i++){
            sum+=grades[i];
        }
        gradeQuery.setAveScore(sum/grades.length);
        return gradeQuery;
    }

    //根据教师姓名，学科名称和学年查看平均成绩，最高分，最低分
    public GradeQuery findByTeacherAndSchoolYearAndSubject(String teacherNumber, String schoolYear, String subjectNumber){
        Float[] grades = gradeSheetDao.findByTeacherAndSchoolYearAndSubject(teacherNumber, schoolYear, subjectNumber);
        //创建一个拥有最大值，最小值，平均值的实体类
        GradeQuery gradeQuery = new GradeQuery();
        //对成绩数组进行升序排列
        Arrays.sort(grades);
        //手动封装实体类数据
        gradeQuery.setMinScore(grades[0]);
        gradeQuery.setMaxScore(grades[grades.length-1]);
        float sum=0;
        for (int i=0; i<grades.length; i++){
            sum+=grades[i];
        }
        gradeQuery.setAveScore(sum/grades.length);
        return gradeQuery;
    }

    //根据学生学号，学年和学科查询成绩
    public Float findStudentAndSchoolYearAndSubject(String studentNumber, String schoolYear, String subjectNumber){
        Float grade = gradeSheetDao.findStudentAndSchoolYearAndSubject(studentNumber, schoolYear, subjectNumber);
        return grade;
    }

}
