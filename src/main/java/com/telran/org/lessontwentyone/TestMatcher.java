package com.telran.org.lessontwentyone;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

    public static void main(String[] args) {
        matchAll("tel", "telrantel.detel");

        List<String> numberList = Arrays.asList(
                "ad4534zx",
                "ad45234zx",
                "aac4534zx",
                "aE4534zx",
                "ad45R4zx",
                "ad4534zx"
        );
        String regex = "[a-z][a-z]\\d\\d\\d\\d[a-z][a-z]";

        numberList.forEach(number -> {
            System.out.println("Is source " + number + " matches " + regex + " "
                    + " = " + isMatch(regex, number));
        });
    }

    private static boolean isMatch(String patternString, String source) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(source);

        return matcher.matches();
    }

    private static void matchAll(String patternString, String source) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            System.out.println("Matcher found from " + matcher.start()
            + " to " + (matcher.end()-1));
        }
    }
}
