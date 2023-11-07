package com.telran.org.lessonten;

public class CompareExample {

    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        boolean isEqual = (a==b);

        System.out.println("primitive a==b " + isEqual);

        int c = 7;
        Integer d = Integer.valueOf(7);
        boolean isEqualWithObject = c == d;
        System.out.println("object and primitive c==d " + isEqualWithObject);

        Integer e = Integer.valueOf(25);
        Integer w = Integer.valueOf(25);

        System.out.println("Object == Object " +(e==w));
    }
}
