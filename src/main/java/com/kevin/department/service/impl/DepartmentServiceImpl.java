package com.kevin.department.service.impl;

import com.kevin.department.dto.Department;
import com.kevin.department.mapper.DepartmentMapper;
import com.kevin.department.service.IDepartmentService;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository("departmentServiceImpl")
public class DepartmentServiceImpl implements IDepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public int createDepartment(Department department) {
        int result = departmentMapper.insert(department);
        return result;
    }
}
