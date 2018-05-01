package com.ele.me.Java8;

@FunctionalInterface
public interface Functional {

    void method();
    //void method2();

    default String  defaultMethod(){
        System.out.println("defaultMethod");
        return "default";
    }

    static String getFunctionName(){
        return "staticFunciton";
    }
}
