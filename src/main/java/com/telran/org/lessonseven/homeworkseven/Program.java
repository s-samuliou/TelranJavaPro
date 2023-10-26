package com.telran.org.lessonseven.homeworkseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {

    public static void main(String[] args) {
        List<Integer> list = initializeList(10000000);
        int[] numbers = {1,2,3,4,5,6,7};

        showTaskOne(list); //Task 1
        showTaskTwo(numbers); //Task 2
    }

    private static void showTaskTwo(int[] numbers) {
        CustomIterator customIterator = new CustomIterator(numbers);

        while (customIterator.hasNext()) {
            System.out.print(customIterator.next() + " ");
        }
    }

    private static void showTaskOne(List<Integer> list) {
        useForeachLoop(list);
        useForLoop(list);
        useForLoopSecondVersion(list);
        useForLoopThirdVersion(list);
        useIterator(list);
        useListIterator(list);
    }

    private static List<Integer> initializeList(int i) {
        List<Integer> initializeList = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            initializeList.add(j);
        }

        return initializeList;
    }

    private static void useForeachLoop(List<Integer> list) {
        long start = System.nanoTime();
        for (Integer element : list) {
            int temp = element;
        }
        long end = System.nanoTime();

        System.out.println("'foreach' lead time: " + (end - start));
    }

    private static void useForLoop(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.size();
        }
        long end = System.nanoTime();

        System.out.println("'for' lead time: " + (end - start));
    }

    private static void useForLoopSecondVersion(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.size();
        }
        long end = System.nanoTime();

        System.out.println("'for' v2 lead time: " + (end - start));
    }

    private static void useForLoopThirdVersion(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = list.size()-1; i >= 0; i--) {
            int temp = list.size();
        }
        long end = System.nanoTime();

        System.out.println("'for' v3 lead time: " + (end - start));
    }

    private static void useIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        long start = System.nanoTime();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        long end = System.nanoTime();

        System.out.println("'iterator' lead time: " + (end - start));
    }

    private static void useListIterator(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();

        long start = System.nanoTime();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        long end = System.nanoTime();

        System.out.println("'list iterator' lead time: " + (end - start));
    }
}
