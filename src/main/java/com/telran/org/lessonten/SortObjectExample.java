package com.telran.org.lessonten;

import com.telran.org.lessonten.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortObjectExample {

    public static void main(String[] args) {
        Person personOne = new Person("One", 20);
        Person personTwo = new Person("Two", 25);
        Person personThree = new Person("Three", 15);

        List<Person> personList = Arrays.asList(personOne, personTwo, personThree);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println();
        SortPersonByAge sortPersonByAge = new SortPersonByAge();
        Collections.sort(personList, sortPersonByAge);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

    }
}
