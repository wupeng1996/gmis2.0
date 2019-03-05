package com.lemon.gmis.service;

import com.lemon.gmis.model.GradeSheet;


public interface GradeSheetService {


    //新增成绩信息
    public GradeSheet saveGradeSheet(GradeSheet gradeSheet);

    //根据id删除成绩信息
    public void deleteByIdGradeSheet(Integer id);

    //修改成绩信息
    public GradeSheet updateGradeSheet(GradeSheet gradeSheet);
}
