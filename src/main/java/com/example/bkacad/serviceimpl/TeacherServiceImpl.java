package com.example.bkacad.serviceimpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.bkacad.dto.TeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.bkacad.model.Teacher;
import com.example.bkacad.repository.TeacherRepository;
import com.example.bkacad.service.TeacherService;

import javax.persistence.Tuple;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Transactional
    public Teacher save(Teacher teacher) {
        Teacher createResponse = teacherRepository.save(teacher);
        return createResponse;
    }

    @Transactional
    public Teacher update(Teacher teacher) {
        Teacher updateResponse = teacherRepository.save(teacher);
        return updateResponse;
    }

    @Transactional
    public Teacher get(Long id) {
        Optional<Teacher> lecturerResponse = teacherRepository.findById(id);
        Teacher getResponse = lecturerResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Teacher teacher) {
        teacherRepository.delete(teacher);
    }

    @Override
    public List<TeacherDTO> getAllTeacher() {
        return  teacherRepository.getAllTeacher();
//        return new ArrayList<>();
//        return lecturerDTOS;
    }

    @Override
    public List<TeacherDTO> getAllTeacherNative() {
        List<Tuple> listTeacherNative = teacherRepository.getAllTeacherNative();
        List<TeacherDTO> teacherDTOS = listTeacherNative.stream()
                .map(t -> new TeacherDTO(
                        t.get(0, BigInteger.class),
                        t.get(1, String.class),
                        t.get(2, String.class)
                ))
                .collect(Collectors.toList());
        return teacherDTOS;
    }

    @Override
    public List<TeacherDTO> findAll() {
        List<Teacher> list =  teacherRepository.findAll();
        List<TeacherDTO> listDTOs = new ArrayList<>();
        list.forEach(teacher -> {
            TeacherDTO teacherDTO = new TeacherDTO();
            teacherDTO.setHotengv(teacher.getTeacherName());
            teacherDTO.setMagv(teacher.getTeacherId());
            listDTOs.add(teacherDTO);
        });
        return listDTOs;
    }

    @Override
    public TeacherDTO getCountBio(String facultyId) {
        return teacherRepository.getCountBio(facultyId);
    }

    @Override
    public TeacherDTO getCountBioNative(String facultyId) {
        Tuple tuple = teacherRepository.getCountBioNative(facultyId);
        return new TeacherDTO(tuple.get(0, BigInteger.class).longValue());
    }
}