package com.example.bkacad.controller;

import com.example.bkacad.model.ClassSubject;
import com.example.bkacad.service.ClassSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classsubject")
public class ClassSubjectController {

    @Autowired
     private ClassSubjectService classSubjectService;

    @PostMapping("/create")
    public ClassSubject createClassSubject(@RequestBody ClassSubject classsubject) {
        ClassSubject createResponse = classSubjectService.save(classsubject);
        return createResponse;
    }

    @PutMapping("/update")
    public ClassSubject updateClassSubject(@RequestBody ClassSubject classsubject) {
        ClassSubject updateResponse = classSubjectService.update(classsubject);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public ClassSubject getcClassSubject(@PathVariable Long id) throws Exception {
        ClassSubject getReponse = classSubjectService.get(id);
        return getReponse;
    }

    @DeleteMapping("/delete")
    public String deleteClassSubject(@RequestBody ClassSubject classsubject) {
        classSubjectService.delete(classsubject);
        return "Record deleted succesfully";
    }
}