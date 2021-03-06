package com.lemon.gmis.dao;

import com.lemon.gmis.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface StudentDao extends JpaRepository<Student,Integer> {

    //查询所有学生,支持分页
    @Query(nativeQuery = true, value = "SELECT * from student limit ?1, ?2")
    public List<Student> findStudent(Integer page, Integer record);


}
