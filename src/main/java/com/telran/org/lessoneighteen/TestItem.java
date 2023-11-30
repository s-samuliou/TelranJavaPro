package com.telran.org.lessoneighteen;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestItem {

    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(
                new Item("New", 33.5),
                new Item("City", 14),
                new Item("Window", 13),
                new Item("Phone", 43),
                new Item("Milk", 15),
                new Item("Table", 30),
                new Item("Sun", 11),
                new Item("Door", 14),
                new Item("Paper", 43),
                new Item("Phone", 31)
        );

        // Task 1
        itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(Item::getName)
                .distinct()
                .forEach(System.out::println);

        // collect() - terminal operation
        List<String> collect = itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(Item::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
