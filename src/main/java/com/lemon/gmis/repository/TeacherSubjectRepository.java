package com.lemon.gmis.repository;

import com.lemon.gmis.entity.SubjectTeacher;
import com.lemon.gmis.entity.TeacherSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface TeacherSubjectRepository extends JpaRepository<TeacherSubject,Integer> {


}
