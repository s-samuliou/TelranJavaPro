package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAppExampleThree {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> iterator = list.listIterator();

        System.out.println("Iterator in forward direction");
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        System.out.println("\nIterator in back direction");
        while (iterator.hasPrevious()) {
            System.out.print(" " + iterator.previous());
        }

        System.out.println();
        ListIterator<String> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            System.out.print(" " + reverse.previous());
        }


    }
}
