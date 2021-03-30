package com.example.bkacad.serviceimpl;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepository;
import com.example.demo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Transactional
    public Faculty save(Faculty faculty) {
        Faculty createResponse = facultyRepository.save(faculty);
        return createResponse;
    }

    @Transactional
    public Faculty update(Faculty faculty) {
        Faculty updateResponse = facultyRepository.save(faculty);
        return updateResponse;
    }

    @Transactional
    public Faculty get(Long id) {
        Optional<Faculty> facultyResponse = facultyRepository.findById(id);
        Faculty getResponse = facultyResponse.get();
        return getResponse;
    }

    @Transactional
    public void delete(Faculty faculty) {
        facultyRepository.delete(faculty);
    }
}