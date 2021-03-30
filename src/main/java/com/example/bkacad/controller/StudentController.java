package com.example.bkacad.controller;


import com.example.bkacad.model.Student;
import com.example.bkacad.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        Student createResponse = studentService.save(student);
        return createResponse;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        Student updateResponse = studentService.update(student);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student getReponse = studentService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student student) {
        studentService.delete(student);
        return "Xóa thành công";
    }

    // Số lượng lớn------------------------------------------

    @PostMapping("/bulkcreate")
    public List<Student> createStudents(@RequestBody List<Student> students) {
        List<Student> createResponse = studentService.saveAll(students);
        return createResponse;
    }

    @PutMapping("/bulkupdate")
    public List<Student> updateStudents(@RequestBody List<Student> students) {
        List<Student> updateResponse = studentService.updateAll(students);
        return updateResponse;
    }

    @GetMapping("/allstudent")
    public List<Student> getStudents() {
        List<Student> getresponse = studentService.getAll();
        return getresponse;
    }

    @DeleteMapping("/bulkdelete")
    public String deleteStudents(@RequestBody List<Student> students) {
        studentService.deleteAll(students);
        return "Records deleted succesfully";
    }
}

