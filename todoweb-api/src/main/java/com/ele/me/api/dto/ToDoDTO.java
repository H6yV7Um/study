package com.ele.me.api.dto;

import java.sql.Timestamp;

public class ToDoDTO {
 
    private long id;
    private String content;
    private Timestamp createdAt;
    private Timestamp updatedAt;
 
    public ToDoDTO () {
    }
 
    public ToDoDTO (long id, String content, Timestamp createdAt, Timestamp updatedAt) {
        setId(id);
        setContent(content);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
 
    public ToDoDTO (String content) {
        this.content = content;
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
 
    @Override
    public String toString() {
        return "ToDoDTO [id=" + id + ", content=" + content + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + "]";
    }
}