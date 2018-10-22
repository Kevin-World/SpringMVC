package com.kevin.department.controller;

import com.kevin.department.dto.Department;
import com.kevin.department.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DepartmentController {
    //@Autowired
    //private IDepartmentService iDepartmentService;
    //@RequestBody Department department

    @RequestMapping("/world")
    public String helloWorld() {
        //iDepartmentService.createDepartment(department);

        return "helloWorld";
    }
}
