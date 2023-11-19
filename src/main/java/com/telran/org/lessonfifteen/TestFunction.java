package com.telran.org.lessonfifteen;

import java.util.function.DoublePredicate;
import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        Function<Integer, Double> half = integer -> integer/2.0;

        Double result = half.apply(5);
        System.out.println(result);
    }
}
