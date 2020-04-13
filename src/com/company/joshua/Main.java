package com.company.joshua;

import com.company.joshua.generics.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Person draperMan = new Person(89, "DraperMan");
        Person peggy = new Person(67, "Peggy");
        Person person = new Person(25, "Joshua");


        Map<String, Person> personMap = new HashMap<>();
        personMap.put(draperMan.getName(), draperMan);
        personMap.put(peggy.getName(), peggy);
        personMap.put(person.getName(), person);

        System.out.println("***********Looping though keys*********************");
        for (String name : personMap.keySet()) {
            System.out.println(name);
        }

        System.out.println("************************Looping though values using key**********************");
        for (String name : personMap.keySet()) {
            System.out.println(personMap.get(name));
        }

        System.out.println("***********************Looping through values*******************************");
        for (Person person1 : personMap.values()) {
            System.out.println(person1);
        }
        System.out.println("****Accessing both key and values******************");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
