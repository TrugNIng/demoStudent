package com.example.bkacad.service;

import com.example.bkacad.model.ClassSubject;
import org.springframework.stereotype.Component;

@Component
public interface ClassSubjectService {
    public ClassSubject save(ClassSubject classsubject);

    public  ClassSubject update(ClassSubject classsubject);

    public ClassSubject get(Long id) throws Exception;

    public void delete(ClassSubject classsubject);
}