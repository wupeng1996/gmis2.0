package com.lemon.gmis.dao;

import com.lemon.gmis.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface SubjectDao extends JpaRepository<Subject,Integer> {


}
