package com.telran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPITwo {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Oleg", "Maxim", "Ivan", "Petr");
        List<Student> students;

        students = nameList.stream()
                .map(name -> new Student(name))
                .collect(Collectors.toList());

        System.out.println(students);

        List<String> names = students.stream()
                .map(name -> name.getName())
                .collect(Collectors.toList());

        System.out.println(names);

        List<String> namesToLowerCase = nameList.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println(namesToLowerCase);

        //flatmap
        List<Integer> one = Arrays.asList(1, 2, 3);
        List<Integer> two = Arrays.asList(4, 5, 6);
        List<Integer> three = Arrays.asList(7, 8, 9);

        List<List<Integer>> list = Arrays.asList(one, two, three);

        list.stream()
                .flatMap(x -> x.stream())
                .forEach(x -> System.out.print(" " + x));
    }
}
