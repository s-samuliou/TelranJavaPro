package com.telran.org.lessoneighteen;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {17, 13, 15}, {7, 8, 23}};
        // 1. Arrays.stream
        Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(x -> System.out.print(x + " "));

        System.out.println();

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        // 2. Stream.of
        Stream.of(array).flatMap(Stream::of)
                .filter(x -> !"a".equals(x))
                .forEach(x -> System.out.print(x + " "));

        //Task 3

    }
}
