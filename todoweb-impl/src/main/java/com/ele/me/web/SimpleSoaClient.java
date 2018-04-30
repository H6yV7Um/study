package com.ele.me.web;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimpleSoaClient {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("pylon.xml");
        SoaRemoteToDoServiceHandler testToDo = ac.getBean(SoaRemoteToDoServiceHandler.class);
        System.out.println("result"+testToDo.geToDos(0, 100));
        ac.close();
        System.exit(0);
    }
}