package com.lemon.gmis.controller;

import com.lemon.gmis.dto.SubjectTeacher;
import com.lemon.gmis.service.SubjectTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectTeacherController {

    @Autowired
    private SubjectTeacherService subjectTeacherService;

    //查询所有学科老师
    @GetMapping("/subjectTeacherAll/{page}/{record}")
    public List<SubjectTeacher> findSubjectTeacher(@PathVariable("page") Integer page, @PathVariable("record") Integer record){
        List<SubjectTeacher> subjectTeacherList = subjectTeacherService.findSubjectTeacher(page, record);
        return subjectTeacherList;
    }
}
