package com.lemon.gmis.controller;


import com.lemon.gmis.model.TeacherSubject;
import com.lemon.gmis.service.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherSubjectController {
    
    @Autowired
    private TeacherSubjectService teacherSubjectService;

    @PostMapping("/teacherSubject")
    //新增老师学科信息
    public String saveTeacherSubject(TeacherSubject teacherSubject){
        TeacherSubject save = teacherSubjectService.saveTeacherSubject(teacherSubject);
        if(save != null){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }

    @DeleteMapping("/teacherSubject/{id}")
    //根据id删除老师学科信息
    public void deleteByIdTeacherSubject(@PathVariable("id") Integer id){
        teacherSubjectService.deleteByIdTeacherSubject(id);
    }

    @PutMapping("/teacherSubject")
    //根据id修改老师学科信息
    public String  updateTeacherSubject(TeacherSubject teacherSubject){
        TeacherSubject update = teacherSubjectService.updateTeacherSubject(teacherSubject);
        if(update != null){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
}
