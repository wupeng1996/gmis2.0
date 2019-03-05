package com.lemon.gmis.controller;

import com.lemon.gmis.model.Subject;
import com.lemon.gmis.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    //查询所有科目,支持分页
    @GetMapping("/subjectAll/{page}/{record}")
    public List<Subject> findSubject(@PathVariable("page") Integer page, @PathVariable("record") Integer record){
        List<Subject> subjectList = subjectService.findSubject(page, record);
        return subjectList;
    }

    @PostMapping("/subject")
    //新增科目信息
    public String saveSubject(Subject subject){
        Subject save = subjectService.saveSubject(subject);
        if(save != null){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }

    @DeleteMapping("/subject/{id}")
    //根据id删除科目信息
    public void deleteByIdSubject(@PathVariable("id") Integer id){
        subjectService.deleteByIdSubject(id);
    }

    @PutMapping("/subject")
    //根据id修改科目信息
    public String  updateSubject(Subject subject){
        Subject update = subjectService.updateSubject(subject);
        if(update != null){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
}
