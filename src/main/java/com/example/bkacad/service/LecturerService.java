package com.example.bkacad.service;

import com.example.bkacad.dto.LecturerDTO;
import com.example.bkacad.model.Lecturer;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface LecturerService {
    Lecturer save(Lecturer lecturer);
    Lecturer update(Lecturer lecturer);
    Lecturer get(Long id);
    void delete(Lecturer lecturer);

    List<Lecturer> getAllLecturer();

    List<LecturerDTO> findAll();



}
