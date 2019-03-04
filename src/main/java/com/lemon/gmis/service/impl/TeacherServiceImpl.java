package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.TeacherDao;
import com.lemon.gmis.model.Teacher;
import com.lemon.gmis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    //查询所有老师,支持分页
    public List<Teacher> findTeacher(Integer page, Integer record){
        page = (page - 1) * record;
        List<Teacher> teacherList = teacherDao.findTeacher(page, record);
        return teacherList;
    }
}
