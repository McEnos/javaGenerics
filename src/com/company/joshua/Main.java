package com.company.joshua;

import com.company.joshua.generics.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Person draperMan = new Person(89, "DraperMan");
        Person peggy = new Person(67, "Peggy");

        Set<Person> people = new HashSet<>();
        people.add(draperMan);
        people.add(draperMan);
        people.add(peggy);
        people.add(peggy);


        System.out.println("******Using iterators*******************");
        // Ensures unique values i.e no duplicates
        //No defined order, else has no get()

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
        System.out.println("************Using generic loops************");

        for (Person person : people) {
            System.out.println(person);
        }


    }
}
