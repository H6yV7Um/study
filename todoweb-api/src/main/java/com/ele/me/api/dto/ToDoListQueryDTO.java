package com.ele.me.api.dto;

public class ToDoListQueryDTO {
 
    private long limit;
    private long offset;
 
    public ToDoListQueryDTO () {
    }
 
    public ToDoListQueryDTO (long offset, long limit) {
        this.setLimit(limit);
        this.setOffset(offset);
    }
 
    public long getLimit() {
        return limit;
    }
 
    public void setLimit(long limit) {
        this.limit = limit;
    }
 
    public long getOffset() {
        return offset;
    }
 
    public void setOffset(long offset) {
        this.offset = offset;
    }
}