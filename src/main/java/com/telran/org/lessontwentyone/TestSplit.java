package com.telran.org.lessontwentyone;

import java.util.regex.Pattern;

public class TestSplit {

    public static void main(String[] args) {
        String text = "I learned about TelRan college and now I am studying Java";

        String[] strings = text.split("\s");

        for (String temp : strings) {
            //System.out.println(temp);
        }

        String textOne = "I+learned+about+TelRan+college+and+now+I+am+studying+Java";
        String[] split = textOne.split("\\+");

        for (String temp : split) {
            //System.out.println(temp);
        }

        String textTwo = "I1learned2about2TelRan3college4and5now6I7am7studying9Java";
        String[] stringsTwo = textTwo.split("\\d");
        for (String temp : stringsTwo) {
            System.out.println(temp);
        }

        Pattern pattern = Pattern.compile("\\d");
        String[] split1 = pattern.split(textTwo);

        for (String temp : split1) {
            System.out.println(temp);
        }

    }


}
