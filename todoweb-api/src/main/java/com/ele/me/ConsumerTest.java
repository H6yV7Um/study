package com.ele.me;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class ConsumerTest {

    public static void main(String args[]){
        //consumer
        BiConsumer<String,String> biConsumer = (String t, String u)->{System.out.println(String.format("biConsumer receive-->%s+%s", t,u));};
        BiConsumer<String, String> biConsumer2 = (String t, String u)->{System.out.println(String.format("biConsumer2 receive-->%s+%s", t,u));};

        biConsumer.andThen(biConsumer2).accept("ttt","uuu");
        biConsumer.accept("vvvv","wwww");

        //function
        BiFunction<String,String,String> function = (String a,String b) ->{
            System.out.println(a+":"+b);
            return "a:"+a+"b:"+b;
        };

        function.apply("bb","dd");

        //predicate

        BiPredicate<String,String> predicate = (String a,String b) ->{
            System.out.println(a+"--->"+b);
            return a.equals(b);

        };

        Boolean su = predicate.test("aa","bb");

        System.out.println(su);

        //Supplier
        Supplier<String> supplier = () ->{
           return "aa";
        };

        System.out.println(supplier.get());

    }
}
