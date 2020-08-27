package com.cvch.springboot.domain.util;

public class Message {
    private int code;
    private String status;
    private String message;
    private String error;
    private Object data;

    public Message() {
    }

    public Message(int code, String status, String message, String error, Object data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }
}
