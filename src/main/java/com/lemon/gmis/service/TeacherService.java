package com.lemon.gmis.service;

import com.lemon.gmis.model.Teacher;

import java.util.List;

public interface TeacherService {

    //查询所有老师,支持分页
    public List<Teacher> findTeacher(Integer page, Integer record);
}
