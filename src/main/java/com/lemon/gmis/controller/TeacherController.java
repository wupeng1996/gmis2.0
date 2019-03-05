package com.lemon.gmis.controller;

import com.lemon.gmis.model.Teacher;
import com.lemon.gmis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/teacher")
    //新增老师信息
    public String saveTeacher(Teacher teacher){
        Teacher save = teacherService.saveTeacher(teacher);
        if(save != null){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }

    @DeleteMapping("/teacher/{id}")
    //根据id删除老师信息
    public void deleteByIdTeacher(@PathVariable("id") Integer id){
        teacherService.deleteByIdTeacher(id);
    }

    @PutMapping("/teacher")
    //根据id修改老师信息
    public String  updateTeacher(Teacher teacher){
        Teacher update = teacherService.updateTeacher(teacher);
        if(update != null){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
}
