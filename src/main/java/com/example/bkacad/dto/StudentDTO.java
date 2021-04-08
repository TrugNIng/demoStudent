package com.example.bkacad.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigInteger;

public class StudentDTO {

        Long masv;
        String hotensv;
        String namsinh;
        String quequan;
        Long count;
        @JsonIgnore
        String makhoa;

    public StudentDTO(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public StudentDTO() {
    }

    public StudentDTO(Long masv, String hotensv, String namsinh, String quequan, Long count, String makhoa) {
        this.masv = masv;
        this.hotensv = hotensv;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.count = count;
        this.makhoa = makhoa;
    }

    public StudentDTO(BigInteger masv, String hotensv, String namsinh, String quequan, Long count, String makhoa) {
        this.masv = masv.longValue();
        this.hotensv = hotensv;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.count = count;
        this.makhoa = makhoa;
    }

    public Long getMasv() {
        return masv;
    }

    public void setMasv(Long masv) {
        this.masv = masv;
    }

    public String getHotensv() {
        return hotensv;
    }

    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() { return quequan; }

    public void setQuequan(String quequan) { this.quequan = quequan; }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }
}
