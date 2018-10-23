package com.kevin.student.controllers;

import com.kevin.student.dto.Student;
import com.kevin.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/query")
    public String queryStudent(@RequestBody Student student){
        studentService.createStudent(student);

        return "student";
    }
}
