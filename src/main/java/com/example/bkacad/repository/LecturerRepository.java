package com.example.bkacad.repository;

import com.example.bkacad.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;



@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Serializable>{

}







