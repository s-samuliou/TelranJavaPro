package com.telran.org.lessonfifteen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        //Consumer(interface) - accept(variable)

        Consumer<Integer> consumer = (value) -> System.out.println("Result integer*2 = " + (value*2));

        consumer.accept(6);
        consumer.accept(5);

        //Multiply all values by 2
        List<Integer> integerList = Arrays.asList(2,3,4,5,6);

        Consumer<List<Integer>> modify = (values) -> {
            values.replaceAll(integer -> integer * 2);
        };

        modify.accept(integerList);
        System.out.println(integerList);
    }
}
