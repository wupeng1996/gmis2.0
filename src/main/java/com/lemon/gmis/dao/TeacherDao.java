package com.lemon.gmis.dao;

import com.lemon.gmis.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface TeacherDao extends JpaRepository<Teacher,Integer> {

    //查询所有老师,支持分页
    @Query(nativeQuery = true, value = "SELECT * from teacher limit ?1, ?2")
    public List<Teacher> findTeacher(Integer page, Integer record);
}
