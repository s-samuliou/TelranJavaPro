package com.telran.org.twentythree;

import java.util.Arrays;
import java.util.List;

public class TestWildCard {

    public static void main(String[] args) {

        StudentPerson alex = new StudentPerson("Alex");
        StudentPerson oleg = new StudentPerson("Oleg");
        Person maxim = new Person("Maxim");

        List<Person> people = Arrays.asList(alex, oleg, maxim);

        List<StudentPerson> studentPeople = Arrays.asList(alex, oleg);

        checkPerson(studentPeople);
    }


    //PECS - Producer Extends Consumer Super

    public static void chechAndAddPerson(List<Person> people) {
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    // people - Producer. аргумент продюсер и используем extends
    public static void checkPerson(List<? extends Person> people) {
        for (Person person : people) {
            System.out.println("Check person " + person);
        }
    }

    //people - Consumer. аргумент явл потребителем и использует super
    public static void addPerson(List<? super StudentPerson> people) {
        StudentPerson person = new StudentPerson("Petr");
        people.add(person);
    }
}
