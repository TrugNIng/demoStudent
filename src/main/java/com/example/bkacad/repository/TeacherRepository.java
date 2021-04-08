package com.example.bkacad.repository;

import com.example.bkacad.dto.TeacherDTO;
import com.example.bkacad.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Tuple;
import java.io.Serializable;
import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Serializable>{

    String getAllTeacher = "SELECT new com.example.bkacad.dto.TeacherDTO(T.teacherId, T.teacherName, F.facultyName) FROM Teacher T JOIN Faculty F ON T.facultyId = F.id";
    @Query(value = getAllTeacher)
    List<TeacherDTO> getAllTeacher();

    String getAllTeacherNative = "SELECT T.magv, T.hotengv, F.tenkhoa FROM teacher T JOIN faculty F ON T.makhoa = F.makhoa";
    @Query(value = getAllTeacherNative, nativeQuery = true)
    List<Tuple> getAllTeacherNative();

    String getCountBio = "SELECT new com.example.bkacad.dto.TeacherDTO(COUNT(T)) FROM Teacher T WHERE T.facultyId = ?1";
    @Query(value = getCountBio)
    TeacherDTO getCountBio(String facultyId);

    String getCountBioNative = "SELECT COUNT(*) FROM teacher WHERE makhoa = ?1";
    @Query(value = getCountBioNative, nativeQuery = true)
    Tuple getCountBioNative(String facultyId);


}







