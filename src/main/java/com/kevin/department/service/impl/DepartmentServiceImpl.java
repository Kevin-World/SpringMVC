package com.kevin.department.service.impl;

import com.kevin.department.dto.Department;
import com.kevin.department.mapper.DepartmentMapper;
import com.kevin.department.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int createDepartment(Department department) {
        departmentMapper.insert(department);
        return 0;
    }

}
