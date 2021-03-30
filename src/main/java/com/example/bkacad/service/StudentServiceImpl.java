package com.example.bkacad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bkacad.model.Student;
import com.example.bkacad.repository.StudentRepository;
import com.example.bkacad.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student save(Student student) {
        Student createResponse = studentRepository.save(student);
        return createResponse;
    }

    @Transactional
    public Student update(Student student) {
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }

    @Transactional
    public Student get(Long student_id) {
        Optional<Student> studentResponse = studentRepository.findById(student_id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    //Số lượng lớn-------------------------

    @Override
    @Transactional
    public List<Student> saveAll(List<Student> students) {
        List<Student> saveResponse = studentRepository.saveAll(students);
        return saveResponse;
    }

    @Override
    @Transactional
    public List<Student> updateAll(List<Student> students) {
        List<Student> updateResponse = studentRepository.saveAll(students);
        return updateResponse;
    }

    @Override
    @Transactional
    public List<Student> getAll() {
        List<Student> saveResponse = studentRepository.findAll();
        return saveResponse;
    }

    @Override
    @Transactional
    public void deleteAll(List<Student> students) {
        studentRepository.deleteAll(students);
    }
}