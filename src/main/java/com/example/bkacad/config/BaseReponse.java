package com.example.bkacad.config;

public class BaseReponse {
    Integer status;
    String messsage;
    Object data;

    public BaseReponse() {
    }

    public BaseReponse(Integer status, String messsage, Object data) {
        this.status = status;
        this.messsage = messsage;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
