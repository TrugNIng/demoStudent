package com.example.bkacad.repository;

import com.example.bkacad.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentRepository extends JpaRepository<Student, Serializable> {
}
