package com.example.bkacad.serviceimpl;

import com.example.bkacad.model.ClassSubject;
import com.example.bkacad.repository.ClassSubjectRepository;
import com.example.bkacad.service.ClassSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;
import java.util.Optional;


@Service
public class ClassServiceImpl implements ClassSubjectService {

    @Autowired
    private ClassSubjectRepository classSubjectRepository;

    @Transactional
    public ClassSubject save(ClassSubject classubject) {
        ClassSubject createResponse = classSubjectRepository.save(classubject);
        return createResponse;
    }

    @Transactional
    public ClassSubject update(ClassSubject classubject) {
        ClassSubject updateResponse = classSubjectRepository.save(classubject);
        return updateResponse;
    }

    @Transactional
    public ClassSubject get(Long id) throws  Exception{
        Optional<ClassSubject> classSubjectResponse = classSubjectRepository.findById(id);
        if (classSubjectResponse.isPresent()) {
            ClassSubject getResponse = classSubjectResponse.get();
            return getResponse;
        }
        throw new SerialException("lop khong ton tai");
    }

    @Transactional
    public void delete(ClassSubject classsubject) {
        classSubjectRepository.delete(classsubject);
    }
}