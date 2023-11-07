package com.telran.org.lessonnine;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestAppSetExampleOne {

    public static void main(String[] args) {
        //SortedSet -> Set ->
        SortedSet<String> sortedSet = new TreeSet<>();
        //add - add element to set
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("F");
        sortedSet.add("C");

        System.out.println(sortedSet);
        //last and first = get last and first ele-ts from sorted set(use SortedSet)
        System.out.println("Last element is: " + sortedSet.last());
        System.out.println("First element is: " + sortedSet.first());
        //contains - check that element exists in set
        System.out.println("Contains: " + sortedSet.contains("E"));
        System.out.println("Contains: " + sortedSet.contains("B"));
        //remove - delete element from set
        sortedSet.remove("B");
        System.out.println(sortedSet);
    }
}
