package com.ele.me;

import org.omg.PortableInterceptor.INACTIVE;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class lambdaTest {

    private final static String dateFormate =  "yyyy-MM-dd HH:mm";

    public static void main(String args[]){

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();


        new Thread(()-> System.out.print("In Java8, Lambda expression rocks !!")).start();*/


//        Calendar dateOfAggregate = Calendar.getInstance();
//        dateOfAggregate.set(Calendar.HOUR_OF_DAY, 18);
//        dateOfAggregate.set(Calendar.MINUTE, 0);
//        dateOfAggregate.set(Calendar.SECOND, 0);
//        dateOfAggregate.set(Calendar.MILLISECOND, 0);
//        System.out.print("dateOfAggregate=" + dateOfAggregate.getTime().toString());



        /*Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormate);
        String dateFormat = sdf.format(date);
         System.out.print( dateFormat.substring(0,15) + "0");*/

//        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//        features.forEach(n -> System.out.println(n));


//        // 不使用lambda表达式为每个订单加上12%的税
//        List<Integer>costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        for (Integer cost : costBeforeTax) {
//            double price = cost + .12*cost;
//            System.out.println(price);
//        }
//
//// 使用lambda表达式
//        List<Integer> costTax = Arrays.asList(100, 200, 300, 400, 500);
//        //costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
//        costTax.stream().map((cost) -> cost+.12*cost).forEach(System.out::println);
//

       /* IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);*/

/*

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14);
        numbers.parallelStream()
                .forEach(System.out::println);
*/


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);


        calendar.add(Calendar.DATE, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));
    }



}
