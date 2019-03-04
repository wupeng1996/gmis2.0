package com.lemon.gmis.service;

import com.lemon.gmis.entity.*;
import com.lemon.gmis.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class GradeQueryService {

    @Autowired
    private GradeSheetRepository gradeSheetRepository;

    @Autowired
    private TeacherSubjectRepository teacherSubjectRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectTeacherRepository subjectTeacherRepository;

    //根据学科和学年查询成绩(学科平均成绩，最高分，最低分)
    public GradeQuery findByYearAndSubject(String schoolYear, String subject){
        Float[] grades = gradeSheetRepository.findByYearAndSubject(schoolYear, subject);
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
        Float[] grades = gradeSheetRepository.findByTeacherAndSubject(teacherNumber, subjectNumber);
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
        Float[] grades = gradeSheetRepository.findByTeacherAndSchoolYearAndSubject(teacherNumber, schoolYear, subjectNumber);
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
        Float grade = gradeSheetRepository.findStudentAndSchoolYearAndSubject(studentNumber, schoolYear, subjectNumber);
        return grade;
    }

    //查询所有学生,支持分页
    public List<Student> findStudent(Integer page, Integer record){
        page = (page - 1) * record;
        List<Student> studentList = studentRepository.findStudent(page, record);
        return studentList;
    }

    //查询所有老师,支持分页
    public List<Teacher> findTeacher(Integer page, Integer record){
        page = (page - 1) * record;
        List<Teacher> teacherList = teacherRepository.findTeacher(page, record);
        return teacherList;
    }

    //查询所有学科老师

    public List<SubjectTeacher> findSubjectTeacher(Integer page, Integer record){
        page = (page - 1) * record;
        List<SubjectTeacher> subjectTeacherList = subjectTeacherRepository.findSubjectTeacher(page, record);
        return subjectTeacherList;
    }
}
