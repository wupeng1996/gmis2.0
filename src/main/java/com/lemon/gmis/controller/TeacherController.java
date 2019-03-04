package com.lemon.gmis.controller;

import com.lemon.gmis.model.Teacher;
import com.lemon.gmis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {


    @Autowired
    private TeacherService teacherService;
    //查询所有老师,支持分页
    @GetMapping("/teacherAll/{page}/{record}")
    public List<Teacher> findTeacher(@PathVariable("page") Integer page, @PathVariable("record") Integer record){
        List<Teacher> teacherList = teacherService.findTeacher(page, record);
        return teacherList;
    }
}
