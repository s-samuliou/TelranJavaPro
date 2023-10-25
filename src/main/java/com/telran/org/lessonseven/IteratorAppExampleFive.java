package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.List;

public class IteratorAppExampleFive {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        //1
        /*long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.print(" " + integer);
        }
        long end = System.currentTimeMillis();
        System.out.println("\ntime for execute is: " + (end - start));
*/
        long start2 = System.currentTimeMillis();
        for (Integer element : list) {
            System.out.print(" " + element);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("\ntime for execute is: " + (end2 - start2));


    }
}
