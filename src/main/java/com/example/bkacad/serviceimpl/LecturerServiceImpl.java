package com.example.bkacad.serviceimpl;

import java.util.List;
import java.util.Optional;


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
    public Lecturer get(Long lecturer_id) {
        Optional<Lecturer> lecturerResponse = lecturerRepository.findById(lecturer_id);
        Lecturer getResponse = lecturerResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Lecturer lecturer) {
        lecturerRepository.delete(lecturer);
    }

    //Số lượng lớn-------------------------

    @Override
    @Transactional
    public List<Lecturer> saveAll(List<Lecturer> lecturer) {
        List<Lecturer> saveResponse = lecturerRepository.saveAll(lecturer);
        return saveResponse;
    }

    @Override
    @Transactional
    public List<Lecturer> updateAll(List<Lecturer> lecturer) {
        List<Lecturer> updateResponse = lecturerRepository.saveAll(lecturer);
        return updateResponse;
    }

    @Override
    @Transactional
    public List<Lecturer> getAll() {
        List<Lecturer> saveResponse = lecturerRepository.findAll();
        return saveResponse;
    }

    @Override
    @Transactional
    public void deleteAll(List<Lecturer> lecturer) {
        lecturerRepository.deleteAll(lecturer);
    }
}