package com.example.bkacad.repository;

import com.example.bkacad.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Serializable> {

}