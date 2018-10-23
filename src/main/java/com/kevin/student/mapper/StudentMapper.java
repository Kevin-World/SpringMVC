package com.kevin.student.mapper;

import com.kevin.student.dto.Student;

import java.util.List;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}