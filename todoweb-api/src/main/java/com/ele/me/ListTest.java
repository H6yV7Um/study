package com.ele.me;

import com.ele.me.api.dto.Person;

import java.util.List;

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
        int a = 5;
        if(a>1){
            System.out.println(1);
        }else if( a>2){
            System.out.println(2);
        }


    }

    public static void println(List<Person> personLists){
        personLists.stream().forEach(person ->System.out.println(person));
    }
}


