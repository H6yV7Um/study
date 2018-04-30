package com.ele.me.web;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ele.me.todo.api.ToDoService;
import com.ele.me.todo.dto.ToDoAddedRespDTO;
import com.ele.me.todo.dto.ToDoAsyncAddedRespDTO;
import com.ele.me.todo.dto.ToDoDTO;
import com.ele.me.todo.dto.ToDoListQueryDTO;
import com.ele.me.todo.dto.ToDoLogDTO;
import com.ele.me.todo.dto.ToDoLogsQueryDTO;
 
 
@Service
public class SoaRemoteToDoServiceHandler {
    @Autowired
    private ToDoService client;
 
    public SoaRemoteToDoServiceHandler() {
        // TODO Auto-generated constructor stub
    }
 
    public List<ToDoDTO> geToDos(long offset, long limit) {
        return client.getToDoList(new ToDoListQueryDTO(offset, limit));
    }
 
    public ToDoAddedRespDTO addToDo(String content) {
        return client.addToDo(new ToDoDTO(content));
    }
}