package com.telran.org.twentytwo;

public class GenericTestTwo<T, U> {

    private T objectT;
    private U objectU;

    public GenericTestTwo(T objectT, U objectU) {
        this.objectT = objectT;
        this.objectU = objectU;
    }

    public void print() {
        System.out.println(objectT);
        System.out.println(objectU);
    }
}
