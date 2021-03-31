package com.example.bkacad.model;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long lecturer_id;

    @Column(name = "lecturer_name")
    private String lecturer_name;

    @Column(name = "salary")
    private String salary;

    @Column(name= "faculty_id")
    private String faculty_id;

    public Long getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(Long lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getLecturer_name() {
        return lecturer_name;
    }

    public void setLecturer_name(String lecturer_name) {
        this.lecturer_name = lecturer_name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }
}