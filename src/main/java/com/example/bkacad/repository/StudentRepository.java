package com.example.bkacad.repository;


import com.example.bkacad.dto.StudentDTO;
import com.example.bkacad.dto.TeacherDTO;
import com.example.bkacad.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import java.io.Serializable;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{
//dua ra tat ca sv
    String getAllStudent = "SELECT s FROM Student s";
    @Query(value = getAllStudent)
    List<Student> getAllStudent();
//count svien khoa bio
    String getCountBio = "SELECT new com.example.bkacad.dto.StudentDTO(COUNT(S)) FROM Student S WHERE S.facultyId = ?1";
    @Query(value = getCountBio)
    StudentDTO getCountBio(String facultyId);

    String getCountBioNative = "SELECT COUNT(*) FROM student WHERE makhoa = ?1";
    @Query(value = getCountBioNative, nativeQuery = true)
    Tuple getCountBioNative(String facultyId);
//thong tin sv khoa math



}






