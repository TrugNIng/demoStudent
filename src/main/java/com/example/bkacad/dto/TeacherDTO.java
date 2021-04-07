package com.example.bkacad.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;

import java.math.BigInteger;
import java.nio.channels.InterruptedByTimeoutException;

public class TeacherDTO {
    @JsonIgnore
    Long magv;
    @JsonIgnore
    String hotengv;
    @JsonIgnore
    String tenkhoa;
    Long count;

    public TeacherDTO(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public TeacherDTO() {
    }

    public TeacherDTO(Long magv, String hotengv, String tenkhoa) {
        this.magv = magv;
        this.hotengv = hotengv;
        this.tenkhoa = tenkhoa;
    }

    public TeacherDTO(BigInteger magv, String hotengv, String tenkhoa) {
        this.magv = magv.longValue();
        this.hotengv = hotengv;
        this.tenkhoa = tenkhoa;
    }

    public Long getMagv() {
        return magv;
    }

    public void setMagv(Long magv) {
        this.magv = magv;
    }

    public String getHotengv() {
        return hotengv;
    }

    public void setHotengv(String hotengv) {
        this.hotengv = hotengv;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }
}
