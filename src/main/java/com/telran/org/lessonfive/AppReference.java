package com.telran.org.lessonfive;

import java.util.Arrays;
import java.util.Scanner;

public class AppReference {

    public static void main(String[] args) {
        int count = 5;
        System.out.println("Count before = " + count);
        changeCount(count);
        System.out.println("Count after= " + count);
        count = changeCountWithReturn(count);

        int[] arrayOne = new int[]{1,2,3,4,5};
        System.out.println("Print array before" + Arrays.toString(arrayOne));
        changeArray(arrayOne);
        System.out.println("Print array after" + Arrays.toString(arrayOne));
        arrayOne = null;

        Person alex = new Person("Alex");
        changePerson(alex);
        System.out.println("Person name " + alex);

        int[] arrayTwo = {1,2,3,4,5};
        int[] arrayThree = {1,2,3,4,5};

        if (arrayThree == arrayTwo) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String one = "One";
        String two = "One";

        if (one == two) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String three = new String("One");
        if (one == three) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static void changePerson(Person oleg){
        oleg.name = "Oleg";
    }

    private static void changeArray(int[] arrayOne) {
        arrayOne[0] = 10;
        System.out.println("Print array from method" +
                "" + Arrays.toString(arrayOne));
    }

    private static void changeCount(int count) {
        count += 10;
        System.out.println("Count from method = " + count);
    }

    private static int changeCountWithReturn(int count) {
        count += 10;
        System.out.println("Count from method = " + count);
        return count;
    }
}
