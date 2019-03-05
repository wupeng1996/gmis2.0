package com.lemon.gmis.service;

import com.lemon.gmis.model.Teacher;

import java.util.List;

public interface TeacherService {

    //查询所有老师,支持分页
    public List<Teacher> findTeacher(Integer page, Integer record);

    //新增老师信息
    public Teacher saveTeacher(Teacher teacher);

    //根据id删除老师信息
    public void deleteByIdTeacher(Integer id);

    //修改老师信息
    public Teacher updateTeacher(Teacher teacher);
}
