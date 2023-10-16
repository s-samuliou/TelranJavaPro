package com.telran.org.lessonfive;

public class AppArray {
    public static void main(String[] args) {
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
}
