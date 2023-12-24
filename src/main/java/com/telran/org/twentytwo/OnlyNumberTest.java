package com.telran.org.twentytwo;

public class OnlyNumberTest {

    public static void main(String[] args) {
        OnlyNumber<Integer> integerOnlyNumber = new OnlyNumber<>(1);
        //OnlyNumber<String> integerOnlyNumberTwo = new OnlyNumber<>("Hallo"); // here is error compile
        OnlyNumber numberOne = new OnlyNumber(2);
        OnlyNumber numberTwo = new OnlyNumber(2L);
        //OnlyNumber numberThree = new OnlyNumber("A"); //compile error

    }
}
