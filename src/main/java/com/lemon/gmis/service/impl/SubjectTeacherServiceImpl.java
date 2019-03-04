package com.lemon.gmis.service.impl;

import com.lemon.gmis.dto.SubjectTeacher;
import com.lemon.gmis.dao.SubjectTeacherDao;
import com.lemon.gmis.service.SubjectTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectTeacherServiceImpl implements SubjectTeacherService {


    @Autowired
    private SubjectTeacherDao subjectTeacherDao;

    //查询所有学科老师
    public List<SubjectTeacher> findSubjectTeacher(Integer page, Integer record){
        page = (page - 1) * record;
        List<SubjectTeacher> subjectTeacherList = subjectTeacherDao.findSubjectTeacher(page, record);
        return subjectTeacherList;
    }
}
