package com.example.bkacad.service.implement;

import com.example.bkacad.model.Student;
import com.example.bkacad.repository.StudentRepository;
import com.example.bkacad.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
