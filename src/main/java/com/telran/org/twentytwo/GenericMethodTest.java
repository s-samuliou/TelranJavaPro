package com.telran.org.twentytwo;

public class GenericMethodTest {

    public static void main(String[] args) {

        printClassName("Hallo");
        printClassName(5);
        printClassName(1.0);
    }

    private static void printClassName(Object element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static <T> void printClassNameTwo(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
