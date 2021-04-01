package com.example.bkacad.service;

import com.example.bkacad.model.Faculty;
import org.springframework.stereotype.Component;


@Component
public interface FacultyService {
    public Faculty save(Faculty faculty);
    public Faculty update(Faculty faculty);
    public Faculty get(Long id);
    public void delete(Faculty faculty);
}