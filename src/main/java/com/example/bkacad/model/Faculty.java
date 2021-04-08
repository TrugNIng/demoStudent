package com.example.bkacad.model;

import javax.persistence.*;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="makhoa")
    private Long id;

    @Column(name = "tenkhoa")
    private String facultyName;

    @Column(name = "dienthoai")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String faculty_name) {
        this.facultyName = faculty_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
