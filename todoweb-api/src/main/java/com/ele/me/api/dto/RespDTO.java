package com.ele.me.api.dto;

public class RespDTO {

    private int status;
    private String message;

    public RespDTO() {
        // TODO Auto-generated constructor stub
    }

    public RespDTO(int status, String message) {
        setStatus(status);
        setMessage(message);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RespDTO [status=" + status + ", message=" + message + "]";
    }
}