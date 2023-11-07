package com.telran.org.lessonten.homeworkten.sorting;

import java.util.Comparator;

public class SortByNameAndSurname implements Comparator<String[]> {
    @Override
    public int compare(String[] o1, String[] o2) {
        int result = o1[0].compareTo(o2[0]);

        if (result == 0) {
            result = o1[1].compareTo(o2[1]);
        }

        return result;
    }
}
