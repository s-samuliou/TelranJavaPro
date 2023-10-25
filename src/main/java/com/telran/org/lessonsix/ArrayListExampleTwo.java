package com.telran.org.lessonsix;

import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);

        List<String> stringListToLowerCase = toLowerCase(stringList);
        System.out.println("New list: " + stringListToLowerCase);

        toLowerCaseInPlace(stringList);
        System.out.println("Original list: " + stringList);
    }

    private static List<String> toLowerCase(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            newList.add(value.toLowerCase());
        }

        return newList;
    }

    private static List<String> toLowerCaseTwo(List<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String value : list) {
            newList.add(value.toLowerCase());
        }

        return list;
    }

    private static void toLowerCaseInPlace(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String value = stringList.get(i);
            String newString = value.toLowerCase();
            stringList.set(i, newString);
        }
    }
}
