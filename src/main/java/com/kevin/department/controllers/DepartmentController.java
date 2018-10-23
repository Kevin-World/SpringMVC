package com.kevin.department.controllers;

import com.kevin.department.dto.Department;
import com.kevin.department.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;
    //@RequestBody Department department

    @RequestMapping("/world")
    public String helloWorld(@RequestBody Department department) {
        departmentService.createDepartment(department);

        return "helloWorld";
    }
}
