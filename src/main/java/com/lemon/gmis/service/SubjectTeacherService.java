package com.lemon.gmis.service;

import com.lemon.gmis.dto.SubjectTeacher;

import java.util.List;

public interface SubjectTeacherService {

    //查询所有学科老师
    public List<SubjectTeacher> findSubjectTeacher(Integer page, Integer record);
}
