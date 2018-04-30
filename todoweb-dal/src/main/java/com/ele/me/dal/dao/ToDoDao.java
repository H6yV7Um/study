package com.ele.me.dal.dao;

import com.ele.me.dal.entity.ToDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ToDoDao {
    /**
     * 查询todo list
     *
     * @param offset
     * @param limit
     * @return
     */
    List<ToDo> queryAll(@Param("offset") long offset, @Param("limit") long limit);
    /**
     * 添加新todo item
     *
     * @param toDo
     * @return
     */
    int insert(ToDo toDo);
}