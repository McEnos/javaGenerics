package com.company.joshua;

import com.company.joshua.generics.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person draperMan = new Person(89, "DraperMan");
        Person peggy = new Person(67, "Peggy");

        List<Person> people = new ArrayList<>();
        people.add(draperMan);
        people.add(peggy);

        people.add(new Person(34, "Test User"));
        System.out.println("****Using normal for loop******");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("******Using iterators*******************");
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
