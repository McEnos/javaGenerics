package com.company.joshua;

import com.company.joshua.generics.AgeComparator;
import com.company.joshua.generics.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person draperMan = new Person(89, "DraperMan");
        Person peggy = new Person(67, "Peggy");
        Person person = new Person(25, "Joshua");

        List<Person> people = new ArrayList<>();

        people.add(draperMan);
        people.add(peggy);
        people.add(person);

        Collections.sort(people, new AgeComparator());

        System.out.println(people);

        System.out.println("*******Using anonymous class");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.getAge(), person2.getAge());
            }
        });


    }
}
