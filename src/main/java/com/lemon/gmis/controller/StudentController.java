package com.lemon.gmis.controller;

import com.lemon.gmis.model.Student;
import com.lemon.gmis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询所有学生,支持分页
    @GetMapping("/studentAll/{page}/{record}")
    public List<Student> findStudent(@PathVariable("page") Integer page, @PathVariable("record") Integer record){
        List<Student> studentList = studentService.findStudent(page, record);
        return studentList;
    }
}
