package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.StudentDao;
import com.lemon.gmis.model.Student;
import com.lemon.gmis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    //查询所有学生,支持分页
    public List<Student> findStudent(Integer page, Integer record){
        page = (page - 1) * record;
        List<Student> studentList = studentDao.findStudent(page, record);
        return studentList;
    }
}
