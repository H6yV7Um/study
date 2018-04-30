package com.ele.me.web.service;

import com.ele.me.api.dto.RespDTO;
import com.ele.me.api.dto.ToDoDTO;
import com.ele.me.api.dto.ToDoListQueryDTO;
import com.ele.me.api.service.ToDoService;
import com.ele.me.dal.dao.ToDoDao;
import com.ele.me.dal.entity.ToDo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoDao toDoDao;

    @Override
    public List<ToDoDTO> getToDoList(ToDoListQueryDTO toDoListQueryDTO) {
        List<ToDo> toDos = toDoDao.queryAll(toDoListQueryDTO.getOffset(),toDoListQueryDTO.getLimit());

        List<ToDoDTO> toDoDTOs = new ArrayList<ToDoDTO>();
        if(CollectionUtils.isEmpty(toDos)){
            for(ToDo toDo:toDos){
                ToDoDTO toDoDTO = new ToDoDTO();
                BeanUtils.copyProperties(toDo,toDoDTO);
                toDoDTOs.add(toDoDTO);
            }

        }
        return toDoDTOs;
    }

    @Override
    public RespDTO addToDo(ToDoDTO toDoDTO) {
        String content = toDoDTO.getContent();
        toDoDao.insert(new ToDo(content));
        return new RespDTO(1, "success");
    }
}
