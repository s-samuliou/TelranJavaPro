package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorAppExampleFour {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //ListIterator<String> iterator = list.listIterator();
        /*for (String element : list) {
            System.out.print(" " + element);
        }*/

        list.forEach(element -> { //аналогичный обычному foreach
            System.out.print(" " + element);
        });
    }
}
