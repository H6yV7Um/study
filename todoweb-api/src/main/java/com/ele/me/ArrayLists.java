package com.ele.me;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String args[]){
        List<Long> aa = new ArrayList<Long>();
        aa.add(1L);
        aa.add(2L);
        aa.add(3L);
        List<Long> bb = new ArrayList<Long>();
        bb.add(2L);
        aa.removeAll(bb);

        System.out.println(aa);
    }
}
