package com.lemon.gmis.service;

import com.lemon.gmis.model.Subject;

import java.util.List;

public interface SubjectService {

    //查询所有课程,支持分页
    public List<Subject> findSubject(Integer page, Integer record);

    //新增课程信息
    public Subject saveSubject(Subject subject);

    //根据id删除课程信息
    public void deleteByIdSubject(Integer id);

    //修改课程信息
    public Subject updateSubject(Subject subject);
}
