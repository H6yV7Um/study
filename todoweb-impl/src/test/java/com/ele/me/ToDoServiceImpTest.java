package com.ele.me;


import com.ele.me.api.dto.ToDoDTO;
import com.ele.me.api.dto.ToDoListQueryDTO;
import com.ele.me.api.service.ToDoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoServiceImpTest extends PylonServiceTest {

    @Autowired
    private ToDoService toDoService;


    @Test
    public void testGetToDoList() {
        System.out.println("result"+toDoService.getToDoList(new ToDoListQueryDTO(0, 10)));
    }
    @Test
    public void testAddToDo() {
        toDoService.addToDo(new ToDoDTO("哈哈哈"));
    }

}
