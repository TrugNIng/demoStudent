package com.example.bkacad.repository;

import com.example.bkacad.dto.LecturerDTO;
import com.example.bkacad.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Serializable>{

    String getAllLecturer = "SELECT l FROM Lecturer l";
    @Query(value = getAllLecturer)
    List<Lecturer> getAllLecturer();
}







