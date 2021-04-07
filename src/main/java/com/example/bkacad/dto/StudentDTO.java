package com.example.bkacad.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentDTO {

        Long masv;
        String hotensv;
        String namsinh;
        String quequan;

        @JsonIgnore
        String makhoa;

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
