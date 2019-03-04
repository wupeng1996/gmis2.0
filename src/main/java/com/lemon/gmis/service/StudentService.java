package com.lemon.gmis.service;

import com.lemon.gmis.model.Student;

import java.util.List;

public interface StudentService {

    //查询所有学生,支持分页
    public List<Student> findStudent(Integer page, Integer record);
}
