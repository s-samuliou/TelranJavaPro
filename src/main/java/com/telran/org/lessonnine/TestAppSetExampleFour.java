package com.telran.org.lessonnine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestAppSetExampleFour {

    public static void main(String[] args) {
        List<String> str = List.of("One", "Two", "One", "Three", "Four", "Three");

        List<String> duplicateList = getDuplicateList(str);
        System.out.println("Duplicates list: " + duplicateList);
    }

    private static List<String> getDuplicateList(List<String> list) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> duplicatesList = new ArrayList<>();

        for (String value : list) {
            if (!uniqueSet.add(value)) {
                duplicatesList.add(value);
            }
        }

        return duplicatesList;
    }
}
