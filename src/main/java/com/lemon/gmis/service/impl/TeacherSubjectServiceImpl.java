package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.TeacherSubjectDao;
import com.lemon.gmis.model.TeacherSubject;
import com.lemon.gmis.service.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherSubjectServiceImpl implements TeacherSubjectService {

    @Autowired
    private TeacherSubjectDao teacherSubjectDao;


    //新增老师学科信息
    @Override
    public TeacherSubject saveTeacherSubject(TeacherSubject teacherSubject) {
        TeacherSubject save = teacherSubjectDao.save(teacherSubject);
        return save;
    }

    //根据id删除老师学科信息
    @Override
    public void deleteByIdTeacherSubject(Integer id) {
        teacherSubjectDao.deleteById(id);
    }

    //修改老师学科信息
    @Override
    public TeacherSubject updateTeacherSubject(TeacherSubject teacherSubject) {
        TeacherSubject update = teacherSubjectDao.saveAndFlush(teacherSubject);
        return update;
    }
}
