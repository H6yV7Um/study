package com.ele.me;

import com.ele.me.api.dto.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String... args) throws Exception {
        /*List<Person> personList = new ArrayList<>();
        PersonFactory<Person> factory = Person::new;
        personList.add(factory.createT("LI1", "HEN", 12));
        personList.add(factory.createT("LI2", "HEN", 56));
        personList.add(factory.createT("LI3", "HEN", 14));
        personList.add(factory.createT("LI4", "THE", 18));
        personList.add(factory.createT("LI5", "THE", 16));
        personList.add(factory.createT("LI6", "THE", 25));
        System.out.println(personList.size());
        Map<String,List<Person>> groupMap = personList.stream().collect(Collectors.groupingBy(Person::getLastName));
        groupMap.forEach((key,val) ->{System.out.println(groupMap.get(key));});
        //System.out.println(groupMap);*/
        List<String> lines = Arrays.asList("spring", "node", "mkyong");


    /* The equivalent example in Java 8, using stream.filter() to
  filter a list, and collect() to convert a stream.
   */
        List<String> result1 = lines.stream()  // convert list to stream
                .filter(line -> {
                    return !"mkyong".equals(line);

                }) // filter the line which equals to "mkyong"
                .collect(Collectors.toList());  // collect the output and convert streams to a list


        System.out.println(result1);
    }

    public static void println(List<Person> personLists){
        personLists.stream().forEach(person ->System.out.println(person));
    }
}


