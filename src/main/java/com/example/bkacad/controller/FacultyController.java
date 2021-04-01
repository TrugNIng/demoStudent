package com.example.bkacad.controller;

import com.example.bkacad.model.Faculty;
import com.example.bkacad.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @PostMapping("/create")
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        Faculty createResponse = facultyService.save(faculty);
        return createResponse;
    }

    @PutMapping("/update")
    public Faculty updateFaculty(@RequestBody Faculty faculty) {
        Faculty updateResponse = facultyService.update(faculty);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Faculty getFaculty(@PathVariable Long id) {
        Faculty getReponse = facultyService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteFaculty(@RequestBody Faculty faculty) {
        facultyService.delete(faculty);
        return "Record deleted succesfully";
    }
}