package com.kevin.teacher.mapper;

import com.kevin.teacher.dto.Teacher;

import java.util.List;

public interface TeacherMapper {

    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}