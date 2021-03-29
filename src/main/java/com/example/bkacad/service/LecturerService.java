package com.example.bkacad.service;

import com.example.bkacad.model.Lecturer;
import org.springframework.stereotype.Component;


@Component
public interface LecturerService {
    public Lecturer save(Lecturer lecturer);
    public Lecturer update(Lecturer lecturer);
    public Lecturer get(Long id);
    public void delete(Lecturer lecturer);




}
