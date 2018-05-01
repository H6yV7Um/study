package com.ele.me.Java8;

import java.util.Arrays;
import java.util.List;

public class LambadaTest {


    public static void main(String args[]){


        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println(e) );

        Arrays.asList("a","b","d").forEach((String e)->System.out.println("result"+e));

        //lambada 表达式可以引用普通成员变量
        /*String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );*/


//        final String separator = ",";
//        Arrays.asList( "a", "b", "d" ).forEach(
//                ( String e ) -> System.out.print( e + separator ) );


        List<String > result =  Arrays.asList( "a", "b", "d" );
        result.sort((e1,e2)->{return e2.compareTo(e1);});
        result.forEach(( String e ) -> System.out.print( e ) );





    }
}
