package com.kevin.teacher.service.impl;

import com.kevin.teacher.dto.Teacher;
import com.kevin.teacher.mapper.TeacherMapper;
import com.kevin.teacher.service.ITeacherService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("teacherServiceImpl")
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public int cerateTeacher(Teacher teacher) {
        int result = teacherMapper.insert(teacher);

        return result;
    }
}
