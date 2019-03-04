package com.lemon.gmis.dao;

import com.lemon.gmis.DTO.SubjectTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectTeacherDao extends JpaRepository<SubjectTeacher,Integer> {

    //查询所有学科老师
    @Query(nativeQuery = true, value = "select s.id, s.subject_number, s.subject_name, t.teacher_number, t.teacher_name from teacher_subject ts, subject s, teacher t where ts.subject_id = s.id and ts.teacher_id = t.id limit ?1, ?2")
    public List<SubjectTeacher> findSubjectTeacher(Integer page, Integer record);
}
