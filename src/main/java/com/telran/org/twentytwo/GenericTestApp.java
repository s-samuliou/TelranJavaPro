package com.telran.org.twentytwo;

public class GenericTestApp {

    public static void main(String[] args) {
        Test objectOne = new Test("Hello");
        System.out.println(objectOne.getObj());

        TestInteger objectTwo = new TestInteger(5);
        System.out.println(objectTwo.getObj());

        GenericTest<String> objectThree = new GenericTest<>("Hello");
        System.out.println(objectThree.getObj());

        GenericTest<Integer> objectFour = new GenericTest<>(5);
        System.out.println(objectFour.getObj());

        GenericTest<Double> objectFive = new GenericTest<>(5.5);
        System.out.println(objectFive.getObj());

        GenericTestTwo<String, Integer> objectSix = new GenericTestTwo<>("Hello", 6);
        objectSix.print();
    }
}
