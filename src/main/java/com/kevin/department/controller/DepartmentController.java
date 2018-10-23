package com.kevin.department.controller;

import com.kevin.department.dto.Department;
import com.kevin.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //@RequestBody Department department

    @RequestMapping("/world")
    public String helloWorld(@RequestBody Department department) {
        departmentService.createDepartment(department);

        return "helloWorld";
    }
}
