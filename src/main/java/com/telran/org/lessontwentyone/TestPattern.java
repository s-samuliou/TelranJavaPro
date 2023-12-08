package com.telran.org.lessontwentyone;

import java.util.regex.Pattern;

public class TestPattern {

    public static void main(String[] args) {
        String regex = ".*www.*";
        String actual = "www.telran.com";

        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(actual).matches();

        System.out.println("Actual string contains REGEX: " + matches);
    }
}
