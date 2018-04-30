package com.ele.me.web;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ele.me.todo.dto.ToDoDTO;
 
 
 
@RestController
public class GreetingController {
 
 
    @Autowired
    private SoaRemoteToDoServiceHandler soaRemoteToDoServiceHandler;
 
    @RequestMapping(value="/todos", method=RequestMethod.GET)
    public List<ToDoDTO> getToDos(
                    @RequestParam(value="offset", defaultValue="0") long offset,
                    @RequestParam(value="limit", defaultValue="100") long limit) {
        return soaRemoteToDoServiceHandler.geToDos(offset, limit);
    }
 
    @RequestMapping(value="/todos", method=RequestMethod.POST)
    public void add(@RequestParam(value="content", defaultValue="") String content) {
        soaRemoteToDoServiceHandler.addToDo(content);
    }
}  