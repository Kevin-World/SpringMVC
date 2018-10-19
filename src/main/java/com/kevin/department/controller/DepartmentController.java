package com.kevin.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DepartmentController {

    @RequestMapping("/world")
    public String helloWorld() {

        return "helloWorld";
    }
}
