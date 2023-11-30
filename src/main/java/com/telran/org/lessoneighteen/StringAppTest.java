package com.telran.org.lessoneighteen;

import java.util.stream.Stream;

public class StringAppTest {

    public static void main(String[] args) {
        String[][] array = {{"Hello", "World"},
            {"Hello", "Java"},
            {"Hello", "Student"},
                {"Welcome", "to", "Tel-Ran"}};


        //Task 1
        long count = Stream.of(array).flatMap(Stream::of)
                .count();
        System.out.println(count);

        //Task 2
        long countUnique = Stream.of(array).flatMap(Stream::of)
                .distinct()
                .count();
        System.out.println(countUnique);


    }
}
