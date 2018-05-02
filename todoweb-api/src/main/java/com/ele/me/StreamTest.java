package com.ele.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public  static void main(String args[]){

        List<String> arrays = Arrays.asList("aa","ab","cc","dd");
        arrays.stream().filter(a ->!"aa".equals(a)).
                map(String::toUpperCase).sorted().
                forEach(System.out::print);
    }
}
