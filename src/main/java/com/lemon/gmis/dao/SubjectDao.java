package com.lemon.gmis.dao;

import com.lemon.gmis.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface SubjectDao extends JpaRepository<Subject,Integer> {

    //查询所有学科,支持分页
    @Query(nativeQuery = true, value = "SELECT * from subject limit ?1, ?2")
    public List<Subject> findSubject(Integer page, Integer record);
}
