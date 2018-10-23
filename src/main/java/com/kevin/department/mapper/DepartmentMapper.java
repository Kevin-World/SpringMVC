package com.kevin.department.mapper;

import com.kevin.department.dto.Department;
import java.util.List;

public interface DepartmentMapper {

    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}