package com.example.bkacad.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LecturerDTO {
    Long magv;
    String hotengv;
    @JsonIgnore
    String tenkhoa;

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
