package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.TeacherDao;
import com.lemon.gmis.model.Teacher;
import com.lemon.gmis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    //查询所有老师,支持分页
    public List<Teacher> findTeacher(Integer page, Integer record){
        page = (page - 1) * record;
        List<Teacher> teacherList = teacherDao.findTeacher(page, record);
        return teacherList;
    }

    //新增老师信息
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        Teacher save = teacherDao.save(teacher);
        return save;
    }

    //根据id删除老师信息
    @Override
    public void deleteByIdTeacher(Integer id) {
        teacherDao.deleteById(id);
    }

    //修改老师信息
    @Override
    public Teacher updateTeacher(Teacher teacher) {
        Teacher update = teacherDao.saveAndFlush(teacher);
        return update;
    }
}
