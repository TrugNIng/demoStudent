package com.example.bkacad.service;

import java.util.List;


import com.example.bkacad.dto.StudentDTO;

import com.example.bkacad.dto.TeacherDTO;
import org.springframework.stereotype.Component;
import com.example.bkacad.model.Student;


@Component
public interface StudentService {
     Student save(Student student);

     Student update(Student student);

     Student get(Long id);

     void delete(Student student);

    // Số lượng lớn---------------------------

     List<Student> saveAll(List<Student> student);

     List<Student> updateAll(List<Student> student);

     List<Student> getAll();

     void deleteAll(List<Student> student);
     //Dto

     List<Student> getAllStudent();

     List<StudentDTO> findAll();

     StudentDTO getCountBio(String facultyId);

     StudentDTO getCountBioNative(String facultyId);





}
