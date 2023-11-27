package com.telran.org.lessonfifteen;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();

        Double aDouble = randomValue.get();
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
    }
}
