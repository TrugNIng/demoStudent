package com.example.bkacad.controller;

import com.example.bkacad.dto.TeacherDTO;
import com.example.bkacad.model.Teacher;
import com.example.bkacad.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/create")
    public Teacher createLecturer(@RequestBody Teacher teacher) {
        Teacher createResponse = teacherService.save(teacher);
        return createResponse;
    }

    @PutMapping("/update")
    public Teacher updateLecturer(@RequestBody Teacher teacher) {
        Teacher updateResponse = teacherService.update(teacher);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Teacher getLecturer(@PathVariable long id) {
        Teacher getReponse = teacherService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteLecturer(@RequestBody Teacher teacher) {
        teacherService.delete(teacher);
        return "Record deleted succesfully";
    }

    @GetMapping("/getAllTeacher")
    public List<TeacherDTO> getAllTeacher(){
        return  teacherService.getAllTeacher();
    }

    @GetMapping("/getAllTeacherNative")
    public List<TeacherDTO> getAllTeacherNative(){
        return  teacherService.getAllTeacherNative();
    }

    @GetMapping("/getCountBio")
    public TeacherDTO getCountBio(@RequestParam("facultyId") String facultyId){
        return  teacherService.getCountBio(facultyId);
    }

    @GetMapping("/getCountBioNative")
    public TeacherDTO getCountBioNative(@RequestParam("facultyId") String facultyId){
        return  teacherService.getCountBioNative(facultyId);
    }
}

