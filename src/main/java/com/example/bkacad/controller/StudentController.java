package com.example.bkacad.controller;

import com.example.bkacad.config.BaseReponse;
import com.example.bkacad.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public BaseReponse getAllStudents(){
        return new BaseReponse(200,"OK",studentService.getAllStudents());
    }
}
