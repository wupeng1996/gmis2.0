package com.lemon.gmis.service;

import com.lemon.gmis.model.Student;

import java.util.List;

public interface StudentService {

    //查询所有学生,支持分页
    public List<Student> findStudent(Integer page, Integer record);

    //新增学生信息
    public Student saveStudent(Student student);

    //根据id删除学生信息
    public void deleteByIdStudent(Integer id);

    //修改学生信息
    public Student updateStudent(Student student);
}
