package com.lemon.gmis.repository;

import com.lemon.gmis.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface SubjectRepository extends JpaRepository<Subject,Integer> {


}
