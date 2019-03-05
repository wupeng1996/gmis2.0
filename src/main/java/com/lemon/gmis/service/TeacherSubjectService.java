package com.lemon.gmis.service;

import com.lemon.gmis.model.TeacherSubject;


public interface TeacherSubjectService {


    //新增老师科目信息
    public TeacherSubject saveTeacherSubject(TeacherSubject teacherSubject);

    //根据id删除老师科目信息
    public void deleteByIdTeacherSubject(Integer id);

    //修改老师科目信息
    public TeacherSubject updateTeacherSubject(TeacherSubject teacherSubject);
}
