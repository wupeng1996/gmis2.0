package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.StudentDao;
import com.lemon.gmis.model.Student;
import com.lemon.gmis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    //查询所有学生,支持分页
    public List<Student> findStudent(Integer page, Integer record){
        page = (page - 1) * record;
        List<Student> studentList = studentDao.findStudent(page, record);
        return studentList;


    }

    //新增学生信息
    @Override
    public Student saveStudent(Student student) {
        Student save = studentDao.save(student);
        return save;
    }

    //根据id删除学生信息
    @Override
    public void deleteByIdStudent(Integer id) {
        studentDao.deleteById(id);
    }

    //修改学生信息
    @Override
    public Student updateStudent(Student student) {
        Student update = studentDao.saveAndFlush(student);
        return update;
    }
}
