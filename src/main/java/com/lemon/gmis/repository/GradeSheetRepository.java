package com.lemon.gmis.repository;

import com.lemon.gmis.entity.GradeSheet;
import com.lemon.gmis.entity.Student;
import com.lemon.gmis.entity.SubjectTeacher;
import com.lemon.gmis.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface GradeSheetRepository extends JpaRepository<GradeSheet,Integer> {

    //根据学科和学年查询成绩(学科平均成绩，最高分，最低分)
    @Query(nativeQuery = true, value = "SELECT g.grade from grade_sheet g, subject s, teacher_subject ts where s.id=ts.subject_id and ts.id=g.teacher_subject_id and ts.school_year = ?1 and s.subject_number = ?2 ")
    public Float[] findByYearAndSubject(String schoolYear, String subjectNumber);

    //根据教师姓名和学科名称查看学科的平均成绩，最高分，最低分
    @Query(nativeQuery = true, value = "SELECT g.grade from grade_sheet g, subject s, teacher_subject ts, teacher t where g.teacher_subject_id = ts.id and ts.teacher_id = t.id and ts.subject_id = s.id and t.teacher_number = ?1 and s.subject_number = ?2 ")
    public Float[] findByTeacherAndSubject(String teacherNumber, String subjectNumber);

    //根据教师姓名，学科名称和学年查看平均成绩，最高分，最低分
    @Query(nativeQuery = true, value = "SELECT g.grade from grade_sheet g, subject s, teacher_subject ts, teacher t where g.teacher_subject_id = ts.id and ts.teacher_id = t.id  and  ts.subject_id = s.id and t.teacher_number = ?1 and ts.school_year = ?2 and s.subject_number = ?3 ")
    public Float[] findByTeacherAndSchoolYearAndSubject(String teacherNumber, String schoolYear, String subjectNumber);

    //根据学生学号，学年和学科查询成绩
    @Query(nativeQuery = true, value = "SELECT g.grade from grade_sheet g, subject s, student stu, teacher_subject ts where g.student_id = stu.id and g.teacher_subject_id = ts.id and ts.subject_id = s.id and stu.student_number = ?1 and ts.school_year = ?2 and s.subject_number = ?3 ")
    public Float findStudentAndSchoolYearAndSubject(String studentNumber, String schoolYear, String subjectNumber);







}
