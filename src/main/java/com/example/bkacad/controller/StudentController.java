package com.example.bkacad.controller;



import com.example.bkacad.dto.StudentDTO;
import com.example.bkacad.model.Student;

import com.example.bkacad.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    StudentService studentService;

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
    public Student getStudent(@PathVariable long id) {
        Student getReponse = studentService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student student) {
        studentService.delete(student);
        return "Record deleted succesfully";
    }

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

//    DTO

    @GetMapping("/getAllStudent")
    public List<StudentDTO> getAllStudent() {
        return studentService.findAll();
    }
    // count so sinh vien khoa Bio
    @GetMapping("/getCountBio")
    public StudentDTO getCountBio(@RequestParam("facultyId") String studentId) {
        return studentService.getCountBio(studentId);
    }

    @GetMapping("/getCountBioNative")
    public StudentDTO getCountBioNative(@RequestParam("facultyId") String studentId) {
        return studentService.getCountBioNative(studentId);
    }
    // thong tin sinh vien khoa Math

}

