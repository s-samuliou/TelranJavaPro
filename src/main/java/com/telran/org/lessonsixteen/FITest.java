package com.telran.org.lessonsixteen;

import java.util.function.Function;
import java.util.function.Supplier;

public class FITest {

    public static void main(String[] args) {
        //taskOne();
        //taskOneVersionTwo();
    }

    public static void taskOne() {
        String text = "some text for task";

        Function<String, String> toUpperCase = String::toUpperCase;

        String upperText = toUpperCase.apply(text);
        System.out.println(upperText);
    }

    public static void taskOneVersionTwo() {
        String text = "some text for task";

        Supplier<String> toUpperCase = () -> text.toUpperCase();

        String newText = toUpperCase.get();

        System.out.println(newText);
    }
}
