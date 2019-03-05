package com.lemon.gmis.service.impl;

import com.lemon.gmis.dao.SubjectDao;
import com.lemon.gmis.model.Subject;
import com.lemon.gmis.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {


    @Autowired
    private SubjectDao subjectDao;

    //查询所有学科,支持分页
    public List<Subject> findSubject(Integer page, Integer record){
        page = (page - 1) * record;
        List<Subject> subjectList = subjectDao.findSubject(page, record);
        return subjectList;


    }

    //新增学科信息
    @Override
    public Subject saveSubject(Subject subject) {
        Subject save = subjectDao.save(subject);
        return save;
    }

    //根据id删除学科信息
    @Override
    public void deleteByIdSubject(Integer id) {
        subjectDao.deleteById(id);
    }

    //修改学科信息
    @Override
    public Subject updateSubject(Subject subject) {
        Subject update = subjectDao.saveAndFlush(subject);
        return update;
    }
}
