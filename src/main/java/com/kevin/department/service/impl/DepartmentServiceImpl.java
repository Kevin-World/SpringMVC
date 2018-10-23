package com.kevin.department.service.impl;

import com.kevin.department.dto.Department;
import com.kevin.department.mapper.DepartmentMapper;
import com.kevin.department.service.DepartmentService;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public int createDepartment(Department department) {
        departmentMapper.insert(department);
        return 0;
    }

}
