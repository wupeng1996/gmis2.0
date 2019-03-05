package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.GradeSheetDao;
import com.lemon.gmis.model.GradeSheet;
import com.lemon.gmis.service.GradeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GradeSheetServiceImpl implements GradeSheetService {

    @Autowired
    private GradeSheetDao gradeSheetDao;


    //新增成绩信息
    @Override
    public GradeSheet saveGradeSheet(GradeSheet gradeSheet) {
        GradeSheet save = gradeSheetDao.save(gradeSheet);
        return save;
    }

    //根据id删除成绩信息
    @Override
    public void deleteByIdGradeSheet(Integer id) {
        gradeSheetDao.deleteById(id);
    }

    //修改成绩信息
    @Override
    public GradeSheet updateGradeSheet(GradeSheet gradeSheet) {
        GradeSheet update = gradeSheetDao.saveAndFlush(gradeSheet);
        return update;
    }
}
