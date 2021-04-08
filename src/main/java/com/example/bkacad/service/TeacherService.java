package com.example.bkacad.service;

import com.example.bkacad.dto.TeacherDTO;
import com.example.bkacad.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface TeacherService {
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    Teacher get(Long id);
    void delete(Teacher teacher);

    List<TeacherDTO> getAllTeacher();
    List<TeacherDTO> getAllTeacherNative();

    List<TeacherDTO> findAll();

    TeacherDTO getCountBio(String facultyId);

    TeacherDTO getCountBioNative(String facultyId);



}
