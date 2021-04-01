package com.example.bkacad.service;

import com.example.bkacad.model.Lecturer;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface LecturerService {
    public Lecturer save(Lecturer lecturer);
    public Lecturer update(Lecturer lecturer);
    public Lecturer get(Long lecturer_id);
    public void delete(Lecturer lecturer);


    // Số lượng lớn---------------------------

    public List<Lecturer> saveAll(List<Lecturer> lecturer);
    public List<Lecturer> updateAll(List<Lecturer> lecturer);
    public List<Lecturer> getAll();
    public void deleteAll(List<Lecturer> lecturer);


}
