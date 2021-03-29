package com.example.bkacad.repository;

import com.example.bkacad.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;



@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{

}






