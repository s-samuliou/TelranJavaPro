package com.telran.org.twentytwo;

public class OnlyNumber<T extends Number>{

    private T number;

    public OnlyNumber(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println(this.number);
    }

}
