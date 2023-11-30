package com.telran.org.lessoneighteen;

import java.util.ArrayList;
import java.util.List;

public class StudentAppTest {

    public static void main(String[] args) {
        Student alex = new Student(1, "Alex");
        alex.addBook("Java 8");
        alex.addBook("Spring Boot");
        alex.addBook("Effective Java");

        Student max = new Student(2, "Max");
        max.addBook("Effective Java");
        max.addBook("Patterns");
        max.addBook("HTML");

        List<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(max);

        students.stream().map(x -> x.getBook())
                .flatMap(x -> x.stream())
                .distinct()
                .forEach(x -> System.out.println(x));


    }
}
