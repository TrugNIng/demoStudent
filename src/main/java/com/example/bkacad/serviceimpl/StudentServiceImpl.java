package com.example.bkacad.serviceimpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.example.bkacad.dto.StudentDTO;
import com.example.bkacad.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.bkacad.model.Student;
import com.example.bkacad.repository.StudentRepository;

import javax.persistence.Tuple;

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
    public Student get(Long id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public List<Student> saveAll(List<Student> student) {
        return null;
    }

    @Override
    public List<Student> updateAll(List<Student> student) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void deleteAll(List<Student> student) {

    }
//    DTO
    //lay ra tat ca sinh vien
    @Override

    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }
        
        @Override
    public List<StudentDTO> findAll() {
        List<Student> list =  studentRepository.findAll();
        List<StudentDTO> listDTOs = new ArrayList<>();
        list.forEach(student -> {
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setHotensv(student.getFull_name());
            studentDTO.setMasv(student.getStudentId());
            studentDTO.setQuequan(student.getAddress());
            studentDTO.setNamsinh(student.getBirthday());
            listDTOs.add(studentDTO);
        });
        return listDTOs;
    }
    // count so sinh vien khoa bio
    @Override
    public StudentDTO getCountBio(String studentId) {
        return studentRepository.getCountBio(studentId);
    }

    @Override
    public StudentDTO getCountBioNative(String studentId) {
        Tuple tuple = studentRepository.getCountBioNative(studentId);
        return new StudentDTO(tuple.get(0, BigInteger.class).longValue());
    }


    // thong tin sinh vien khoa math



}