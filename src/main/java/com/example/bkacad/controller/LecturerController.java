package com.example.bkacad.controller;

import com.example.bkacad.model.Lecturer;
import com.example.bkacad.service.LecturerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/lecturer")
public class LecturerController {

        @Autowired
        LecturerService lecturerService;

        @PostMapping("/create")
        public Lecturer createLecturer(@RequestBody Lecturer lecturer){
            Lecturer createResponse = lecturerService.save(lecturer);
            return createResponse;
        }

        @PutMapping("/update")
        public Lecturer updateLecturer(@RequestBody Lecturer lecturer){
            Lecturer updateResponse = lecturerService.update(lecturer);
            return updateResponse;
        }

        @GetMapping("/{id}")
        public Lecturer getLecturer(@PathVariable long id) {
            Lecturer getReponse = lecturerService.get(id);
            return getReponse;
        }
        @DeleteMapping("/delete")
        public String deleteLecturer(@RequestBody Lecturer lecturer) {
            lecturerService.delete(lecturer);
            return "Record deleted succesfully";
        }


    }

