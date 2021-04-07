package com.example.bkacad.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.bkacad.dto.LecturerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.bkacad.model.Lecturer;
import com.example.bkacad.repository.LecturerRepository;
import com.example.bkacad.service.LecturerService;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    @Transactional
    public Lecturer save(Lecturer lecturer) {
        Lecturer createResponse = lecturerRepository.save(lecturer);
        return createResponse;
    }

    @Transactional
    public Lecturer update(Lecturer lecturer) {
        Lecturer updateResponse = lecturerRepository.save(lecturer);
        return updateResponse;
    }

    @Transactional
    public Lecturer get(Long id) {
        Optional<Lecturer> lecturerResponse = lecturerRepository.findById(id);
        Lecturer getResponse = lecturerResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Lecturer lecturer) {
        lecturerRepository.delete(lecturer);
    }

    @Override
    public List<Lecturer> getAllLecturer() {
        return  lecturerRepository.getAllLecturer();
//        return new ArrayList<>();
//        return lecturerDTOS;
    }

    @Override
    public List<LecturerDTO> findAll() {
        List<Lecturer> list =  lecturerRepository.findAll();
        List<LecturerDTO> listDTOs = new ArrayList<>();
        list.forEach(lecturer -> {
            LecturerDTO lecturerDTO = new LecturerDTO();
            lecturerDTO.setHotengv(lecturer.getLecturer_name());
            lecturerDTO.setMagv(lecturer.getLecturer_id());
            listDTOs.add(lecturerDTO);
        });
        return listDTOs;
    }
}