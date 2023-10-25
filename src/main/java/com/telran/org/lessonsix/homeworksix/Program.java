package com.telran.org.lessonsix.homeworksix;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();


        for (int i = 0; i < 10; i++) { //Initialize Lists
            integerList.add(i);

            if (i % 2 != 0) {
                stringList.add("Color");
            } else {
                stringList.add("Color" + i * 4);
            }
        }

        startup(integerList, stringList);
    }

    private static void startup(List<Integer> integerList, List<String> stringList) {
        System.out.println("Default integer list: " + integerList); //show integerList
        System.out.println("Default string list: " + stringList); //show stringList

        List<Integer> multipleList; // Task 1
        multipleList = getDoubleValues(integerList);
        System.out.println("Task 1: " + multipleList);

        List<Integer> lengthStringList; // Task 2
        lengthStringList = getWordLength(stringList);
        System.out.println("Task 2: " + lengthStringList);

        List<Integer> oddNumbersList; // Task 3
        oddNumbersList = getOddNumbers(integerList);
        System.out.println("Task 3: " + oddNumbersList);

        List<String> noDuplicatesList; // Task 4
        noDuplicatesList = deleteDuplicates(stringList);
        System.out.println("Task 4: " + noDuplicatesList);
    }

    private static List<Integer> getDoubleValues(List<Integer> list) {
        List<Integer> doubleList = new ArrayList<>();

        for (Integer element : list) {
            doubleList.add(element * 2);
        }

        return doubleList;
    }

    private static List<Integer> getWordLength(List<String> list) {
        List<Integer> arrayList = new ArrayList<>();

        for (String element : list) {
            arrayList.add(element.length());
        }

        return arrayList;
    }

    private static List<Integer> getOddNumbers(List<Integer> list) {
        List<Integer> arrayList = new ArrayList<>();

        for (Integer element : list) {
            if (element % 2 != 0) {
                arrayList.add(element);
            }
        }

        return arrayList;
    }

    private static List<String> deleteDuplicates(List<String> list) {
        List<String> uniqueValues = new ArrayList<>();

        for (String element : list) {
            if (!uniqueValues.contains(element)) {
                uniqueValues.add(element);
            }
        }

        return uniqueValues;
    }
}
