package com.kevin.student.service.impl;

import com.kevin.student.dto.Student;
import com.kevin.student.mapper.StudentMapper;
import com.kevin.student.service.IStudentService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int createStudent(Student student) {
        int result = studentMapper.insert(student);
        return result;
    }
}
