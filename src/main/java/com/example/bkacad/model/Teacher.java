package com.example.bkacad.model;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "magv")
    private  Long teacherId;

    @Column(name = "hotengv")
    private String teacherName;

    @Column(name = "luong")
    private String salary;

    @Column(name= "makhoa")
    private String facultyId;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long lecturer_id) {
        this.teacherId = lecturer_id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String lecturer_name) {
        this.teacherName = lecturer_name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String faculty_id) {
        this.facultyId = faculty_id;
    }
}