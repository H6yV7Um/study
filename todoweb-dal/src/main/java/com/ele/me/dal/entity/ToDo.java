package com.ele.me.dal.entity;

import java.sql.Timestamp;

public class ToDo {

    private long id;
    private String content;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public ToDo(long id, String content, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ToDo(String content) {
        this.content = content;
    }

    //有带参数构造方法，必须要生成不带参的默认构造方法，否则反射会报错
    public ToDo() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
