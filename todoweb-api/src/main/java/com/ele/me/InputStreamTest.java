package com.ele.me;

import java.util.stream.IntStream;

public class InputStreamTest {
    private static final int MAX_SESSIONS = 256;

    public static void main(String args[]){
        IntStream.range(0, MAX_SESSIONS).forEach(i-> System.out.println(i));
        System.out.println("sss");
    }
}
