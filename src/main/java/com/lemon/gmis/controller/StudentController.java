package com.lemon.gmis.controller;

import com.lemon.gmis.model.Student;
import com.lemon.gmis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/student")
    //新增学生信息
    public String saveStudent(Student student){
        Student save = studentService.saveStudent(student);
        if(save != null){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }

    @DeleteMapping("/student/{id}")
    //根据id删除学生信息
    public void deleteByIdStudent(@PathVariable("id") Integer id){
        studentService.deleteByIdStudent(id);
    }

    @PutMapping("/student")
    //根据id修改学生信息
    public String  updateStudent(Student student){
        Student update = studentService.updateStudent(student);
        if(update != null){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
}
