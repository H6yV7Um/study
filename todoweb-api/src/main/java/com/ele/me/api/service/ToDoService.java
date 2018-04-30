package com.ele.me.api.service;

import com.ele.me.api.dto.RespDTO;
import com.ele.me.api.dto.ToDoDTO;
import com.ele.me.api.dto.ToDoListQueryDTO;

import java.util.List;

public interface ToDoService {
    /**
     * 获取todo list
     *
     * @param toDoListQueryDTO
     * @return
     */
    List<ToDoDTO> getToDoList(ToDoListQueryDTO toDoListQueryDTO);
 
    /**
     * 添加新的todo项
     *
     * @param toDoDTO
     * @return
     */
   RespDTO addToDo(ToDoDTO toDoDTO);
}