package com.telran.org.twentytwo;

public class OnlyNumberTwo<T ,U> {

    private T numberOne;
    private U numberTwo;

    public OnlyNumberTwo(T numberOne, U numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void printSum() {
        System.out.println(numberOne);
    }
}
