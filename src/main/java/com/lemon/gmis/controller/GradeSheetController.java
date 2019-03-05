package com.lemon.gmis.controller;

import com.lemon.gmis.model.GradeSheet;
import com.lemon.gmis.service.GradeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GradeSheetController {

    @Autowired
    private GradeSheetService gradeSheetService;


    @PostMapping("/gradeSheet")
    //新增成绩信息
    public String saveGradeSheet(GradeSheet gradeSheet){
        GradeSheet save = gradeSheetService.saveGradeSheet(gradeSheet);
        if(save != null){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }

    @DeleteMapping("/gradeSheet/{id}")
    //根据id删除成绩信息
    public void deleteByIdGradeSheet(@PathVariable("id") Integer id){
        gradeSheetService.deleteByIdGradeSheet(id);
    }

    @PutMapping("/gradeSheet")
    //根据id修改成绩信息
    public String  updateGradeSheet(GradeSheet gradeSheet){
        GradeSheet update = gradeSheetService.updateGradeSheet(gradeSheet);
        if(update != null){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
}
