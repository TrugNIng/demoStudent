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

import java.util.List;


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

        @GetMapping("/{lecturer_id}")
        public Lecturer getLecturer(@PathVariable Long lecturer_id) {
            Lecturer getReponse = lecturerService.get(lecturer_id);
            return getReponse;
        }
        @DeleteMapping("/delete")
        public String deleteLecturer(@RequestBody Lecturer lecturer) {
            lecturerService.delete(lecturer);
            return "Record deleted succesfully";
        }
    // Số lượng lớn------------------------------------------

    @PostMapping("/bulkcreate")
    public List<Lecturer> createLecturer(@RequestBody List<Lecturer>lecturer){
        List<Lecturer> createResponse = lecturerService.saveAll(lecturer);
        return createResponse;
    }

    @PutMapping("/bulkupdate")
    public List<Lecturer> updateLecturer(@RequestBody List<Lecturer> lecturer){
        List<Lecturer> updateResponse = lecturerService.updateAll(lecturer);
        return updateResponse;
    }

    @GetMapping("/alllecturer")
    public List<Lecturer> getLecturer(@PathVariable long id) {
        List<Lecturer> getReponse = lecturerService.getAll();
        return getReponse;
    }
    @DeleteMapping("/bulkdelete")
    public String deleteLecturer(@RequestBody List<Lecturer> lecturer) {
        lecturerService.deleteAll(lecturer);
        return "Record deleted succesfully";
    }

    }

