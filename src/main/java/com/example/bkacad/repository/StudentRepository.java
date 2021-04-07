package com.example.bkacad.repository;


import com.example.bkacad.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{

    String getAllStudent = "SELECT s FROM Student s";
    @Query(value = getAllStudent)
    List<Student> getAllStudent();
}






